package com.example.zoologico;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class Modificar extends Fragment {

    // private OnFragmentInteractionListener mListener;
    Spinner clase, tipo;
    EditText nombre, habit, alim,fech,id;
    CheckBox sexo;
    String a,b,c,sex;
    public SQLite sqlite;
    Button btnBuscar, btnGuardar;
    public Modificar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_modificar,container,false);
        clase = (Spinner) view.findViewById(R.id.clasificacionm);
        tipo = (Spinner) view.findViewById(R.id.spnesm);
        sexo = (CheckBox) view.findViewById(R.id.sexom);

        id = (EditText) view.findViewById(R.id.idm);
        nombre = (EditText) view.findViewById(R.id.nombrem);
        habit = (EditText) view.findViewById(R.id.habitatm);
        alim = (EditText) view.findViewById(R.id.alimantam);
        fech = (EditText) view.findViewById(R.id.fecham);

        btnBuscar = (Button) view.findViewById(R.id.btnbuscar);
        btnGuardar = (Button) view.findViewById(R.id.btnguardarm);

        clase.setVisibility(view.INVISIBLE);
        tipo.setVisibility(view.INVISIBLE);
        sexo.setVisibility(view.INVISIBLE);
        nombre.setVisibility(view.INVISIBLE);
        habit.setVisibility(view.INVISIBLE);
        alim.setVisibility(view.INVISIBLE);
        fech.setVisibility(view.INVISIBLE);
        btnGuardar.setVisibility(view.INVISIBLE);

        sqlite= new SQLite(getContext());
        sqlite.abrir();
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),R.array.opciones,android.R.layout.simple_spinner_item);
        clase.setAdapter(adapter);
        clase.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String opcion= String.valueOf(clase.getSelectedItemId());
                int op = Integer.parseInt(opcion);
                System.out.println(opcion);
                if (op==0)
                {

                }if (op==1)
                {

                    final ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(getContext(),R.array.o1,android.R.layout.simple_spinner_item);
                    tipo.setAdapter(adapter1);
                    a=adapter.getItem(1).toString();
                    tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String opcion= String.valueOf(tipo.getSelectedItemId());
                            int op = Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if(op==0){
                            }
                            if(op==1){
                                b=adapter1.getItem(1).toString();
                                Toast.makeText(getContext(),a+" "+b,Toast.LENGTH_SHORT).show();
                            }else if(op==2){
                                b=adapter1.getItem(2).toString();
                            }else if(op==3){
                                b=adapter1.getItem(3).toString();
                            }else if(op==4){
                                b=adapter1.getItem(4).toString();
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }else if(op==2){
                    final ArrayAdapter<CharSequence>adapter2= ArrayAdapter.createFromResource(getContext(),R.array.o2,android.R.layout.simple_spinner_item);
                    tipo.setAdapter(adapter2);
                    a=adapter.getItem(2).toString();
                    tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                            String opcion = String.valueOf(tipo.getSelectedItemId());
                            int op= Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if(op==0){

                            }else if (op==1){
                                b=adapter2.getItem(1).toString();
                            }else if (op==2){
                                b=adapter2.getItem(2).toString();
                            }else if (op==3){
                                b=adapter2.getItem(3).toString();
                            }else if (op==4){
                                b=adapter2.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView){

                        }
                    });

                }else if(op==3){
                    final ArrayAdapter<CharSequence>adapter3= ArrayAdapter.createFromResource(getContext(),R.array.o3,android.R.layout.simple_spinner_item);
                    tipo.setAdapter(adapter3);
                    a=adapter.getItem(3).toString();
                    tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                            String opcion = String.valueOf(tipo.getSelectedItemId());
                            int op= Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if(op==0){

                            }else if (op==1){
                                b=adapter3.getItem(1).toString();
                            }else if (op==2){
                                b=adapter3.getItem(2).toString();
                            }else if (op==3){
                                b=adapter3.getItem(3).toString();
                            }else if (op==4){
                                b=adapter3.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView){

                        }
                    });
                }else if (op==4){
                    final ArrayAdapter<CharSequence>adapter4= ArrayAdapter.createFromResource(getContext(),R.array.o4,android.R.layout.simple_spinner_item);
                    tipo.setAdapter(adapter4);
                    a=adapter.getItem(4).toString();
                    tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                            String opcion = String.valueOf(tipo.getSelectedItemId());
                            int op= Integer.parseInt(opcion);
                            System.out.println(opcion);
                            if(op==0){

                            }else if (op==1){
                                b=adapter4.getItem(1).toString();
                            }else if (op==2){
                                b=adapter4.getItem(2).toString();
                            }else if (op==3){
                                b=adapter4.getItem(3).toString();
                            }else if (op==4){
                                b=adapter4.getItem(4).toString();
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView){

                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        if(sexo.isChecked()){
            c="Macho";
        }else{
            c="Hembra";
        }


        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!id.getText().toString().equals(""))
                {
                    if (sqlite.getCantidad(Integer.parseInt(id.getText().toString())).getCount()==1)
                    {
                        clase.setVisibility(view.VISIBLE);
                        tipo.setVisibility(view.VISIBLE);
                        sexo.setVisibility(view.VISIBLE);
                        nombre.setVisibility(view.VISIBLE);
                        habit.setVisibility(view.VISIBLE);
                        alim.setVisibility(view.VISIBLE);
                        fech.setVisibility(view.VISIBLE);
                        btnGuardar.setVisibility(view.VISIBLE);
                        int f = Integer.parseInt(id.getText().toString());
                        Cursor cursor = sqlite.getCantidad(f);
                        String g1 =null, g2 =null, g3 =null, g4 =null, g5=null,g6=null,g7=null;
                        if (cursor.moveToFirst())
                        {
                            do {
                                g1 = cursor.getString(3);
                                g2 = cursor.getString(5);
                                g3 = cursor.getString(6);
                                g4 = cursor.getString(7);
                               // g5=c
                            }while (cursor.moveToNext());
                        }
                        nombre.setText(g2.toString());
                        habit.setText(g3.toString());
                        alim.setText(g4.toString());
                        fech.setText(g1.toString());
                        //clase.

                    }
                }
            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!id.getText().toString().equals("")&&
                        !nombre.getText().toString().equals("")&&
                        !habit.getText().toString().equals("")&&
                        !alim.getText().toString().equals("")&&
                        !fech.getText().toString().equals("")
                ){
                    Toast.makeText(getContext(),a+" "+b+" "+
                            nombre.getText().toString().toUpperCase()+" "+
                            c+" "+fech.getText().toString()+" "+
                            habit.getText().toString().toUpperCase()+" "+
                            alim.getText().toString().toUpperCase(), Toast.LENGTH_LONG).show();

                    if (sqlite.actualizarAnimal(Integer.parseInt(id.getText().toString()), a, b,c, nombre.getText().toString().toUpperCase(),
                            fech.getText().toString(),habit.getText().toString().toUpperCase(),alim.getText().toString().toUpperCase()))
                    {
                        Toast.makeText(getContext(),"Registro añadido",Toast.LENGTH_SHORT).show();
                        id.setText("");
                        nombre.setText("");
                        fech.setText("");
                        habit.setText("");
                        alim.setText("");
                        clase.setId(0);
                        tipo.setId(0);
                        sexo.isChecked();
                        Toast.makeText(getContext(),"Registro Actualizado",Toast.LENGTH_SHORT).show();


                    }else{
                        Toast.makeText(getContext(),"Error: compruebe que los datos sean correctos",Toast.LENGTH_SHORT).show();
                    }


                }else{
                    Toast.makeText(getContext(),"Error: no puede haber campos vacios",Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }

  }
