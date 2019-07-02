package com.example.zoologico;

import android.content.Context;
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
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;



public class Crear extends Fragment {

   // private OnFragmentInteractionListener mListener;
    Spinner clase, tipo;
    CheckBox sexo;
    EditText nombre, habitat,aliment,fech,id;
    String a,b,sex,c;
    Button btnGuardar;
    public SQLite sqlite;

    public Crear() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_crear, container, false);
        clase = (Spinner) view.findViewById(R.id.clasificacionc);
        tipo = (Spinner)view.findViewById(R.id.spnes);
        sexo= (CheckBox) view.findViewById(R.id.sexoc);
        id=(EditText)view.findViewById(R.id.idc);
        nombre=(EditText)view.findViewById(R.id.nombrec);
        habitat=(EditText)view.findViewById(R.id.habitatc);
        aliment=(EditText)view.findViewById(R.id.alimantac);
        fech=(EditText)view.findViewById(R.id.fechac);
        btnGuardar=(Button) view.findViewById(R.id.btnguardarc);
        sqlite = new SQLite(getContext());
        sqlite.abrir();
        final ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getContext(),R.array.opciones,android.R.layout.simple_spinner_item);
        clase.setAdapter(adapter);
        clase.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String opcion = String.valueOf(clase.getSelectedItemId());
                int op = Integer.parseInt(opcion);
                System.out.println(opcion);
                if(op==0){

                }
                if(op==1){
                    final ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(getContext(),R.array.o0,android.R.layout.simple_spinner_item);
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
                    final ArrayAdapter<CharSequence>adapter4= ArrayAdapter.createFromResource(getContext(),R.array.o3,android.R.layout.simple_spinner_item);
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

      /*  sexo.setOnItemSelectedListener(new View.OnClickListener(){
            @Override
        public  void Onclick (View view){
            if(sexo.isChecked()){
                c="MACHO";
            }else{
                c="Hembra";
            }
        }
        }*/



btnGuardar.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
        if(!id.getText().toString().equals("")&&
                !id.getText().toString().equals("")&&
        !nombre.getText().toString().equals("")&&
        !habitat.getText().toString().equals("")&&
        !aliment.getText().toString().equals("")&&
        !fech.getText().toString().equals("")
    ){
            Toast.makeText(getContext(),a+" "+
                    nombre.getText().toString().toUpperCase()+" "+
                    sex+" "+fech.getText().toString()+" "+
                    habitat.getText().toString().toUpperCase()+" "+
                    aliment.getText().toString().toUpperCase(), Toast.LENGTH_LONG).show();
            if (sqlite.altaAnimal(Integer.parseInt(id.getText().toString()), a, b, nombre.getText().toString().toUpperCase(),
                    sex, fech.getText().toString(),habitat.getText().toString().toUpperCase(),
                    aliment.getText().toString().toUpperCase())
            ) {
                Toast.makeText(getContext(),"Registro añadido",Toast.LENGTH_SHORT).show();
                id.setText("");
                nombre.setText("");
                fech.setText("");
                habitat.setText("");
                aliment.setText("");
                clase.setId(0);
                tipo.setId(0);
                sexo.isChecked();


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
