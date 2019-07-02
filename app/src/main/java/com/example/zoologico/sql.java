package com.example.zoologico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sql extends SQLiteOpenHelper {
    private static final String database = "zoo";
    private static final int VERSION=1;

    private final String tprod="CREATE TABLE ANIMALS(ID_PROD INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            "CLASIFICACION TEXT NOT NULL, " +
            "ESPECIE TEXT NOT NULL, " +
            "NOMBRE TEXT NOT NULL, " +
            "SEXO TEXT NOT NULL, " +
            "FECHA_ING TEXT NOT NULL, " +
            "HABITAT TEXT NOT NULL, " +
            "ALIMENTO TEXT NOT NULL) ";

    public sql(Context context){
     super(context, database,null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(tprod);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int anterior, int nueva) {
        if(nueva>anterior){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS ANIMALS");
            sqLiteDatabase.execSQL(tprod);
        }
    }
}
