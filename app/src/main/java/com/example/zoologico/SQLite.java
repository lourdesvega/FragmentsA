package com.example.zoologico;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.Editable;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SQLite {
    private sql sql;
    private SQLiteDatabase db;

    public SQLite(Context context){
        sql = new sql(context);
    }

    public SQLite(){

    }

    public void abrir(){
        Log.i("SQLite", "Se abre la conxión a la base de datos "+sql.getDatabaseName());
        db = sql.getWritableDatabase();
    }

    public void cerrar(){
        Log.i("SQLite","Se cierra la conexión a la base de datos "+sql.getDatabaseName());
        sql.close();
    }

    public boolean altaAnimal(int id, String clas, String sex, String esp, String nom, String date, String habitat, String food){
        ContentValues cv= new ContentValues();
        cv.put("ID_PROD",id);
        cv.put("CLASIFICACION",clas);
        cv.put("ESPECIE",esp);
        cv.put("NOMBRE",nom);
        cv.put("SEXO",sex);
        cv.put("FECHA_ING",food);
        cv.put("HABITAT",habitat);
        cv.put("ALIMENTO",food);
        return (db.insert("ANIMALS",null,cv)!=-1)?true:false;
    }

    public Cursor getRegistro(){
        return  db.rawQuery("SELECT * FROM ANIMALS",null);

    }

    public ArrayList<String> getAnimal(Cursor cursor){
        ArrayList<String> listData= new ArrayList<>();
        String item = "";
        if(cursor.moveToFirst()){
            do{
                item+="ID: ["+cursor.getInt(0)+"]\r\n";
                item+="Clasificación: ["+cursor.getInt(0)+"]\r\n";
                item+="Especie: ["+cursor.getInt(0)+"]\r\n";
                item+="Nombre: ["+cursor.getInt(0)+"]\r\n";
                item+="Sexo: ["+cursor.getInt(0)+"]\r\n";
                item+="Fecha: ["+cursor.getInt(0)+"]\r\n";
                item+="Habitat: ["+cursor.getInt(0)+"]\r\n";
                item+="Alimento: ["+cursor.getInt(0)+"]\r\n";
                listData.add(item);

            }while(cursor.moveToNext());
        }
        return listData;
    }

    public ArrayList<String> getID(Cursor cursor){
        ArrayList<String> listData = new ArrayList<>();
        String item = "";
        if(cursor.moveToFirst()){
            do{
                item+="ID: ["+cursor.getInt(0)+"]\r\n";
                listData.add(item);
                item="";
            }while(cursor.moveToNext());
        }
        return listData;
    }

    public String actualizarAnimal(int id, String clas, String sex, String esp, String nom, String date, String habitat, String food){

        ContentValues cv= new ContentValues();
        cv.put("ID_PROD",id);
        cv.put("CLASIFICACION",clas);
        cv.put("ESPECIE",esp);
        cv.put("NOMBRE",nom);
        cv.put("SEXO",sex);
        cv.put("FECHA_ING",food);
        cv.put("HABITAT",habitat);
        cv.put("ALIMENTO",food);
        int cant = db.update("ANIMALS",cv,"ID_PROD="+id,null);
        if(cant==1){
            return "Usuario modificado";
        }else{
            return "Error, no se modificó";
        }
    }

    public Cursor getCantidad(int id){
        return db.rawQuery("SELECT * FROM ANIMALS WHERE ID_PROD = "+id,null);
    }

    public int Eliminar(Editable id){
        return db.delete("ANIMALS","ID_PROD"+id,null);
    }
}
