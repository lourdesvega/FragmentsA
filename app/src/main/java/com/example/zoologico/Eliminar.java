package com.example.zoologico;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Eliminar.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Eliminar extends Fragment {

   // private OnFragmentInteractionListener mListener;

    public Eliminar() {
        // Required empty public constructor
    }
    Button eliminar;
    private SQLite sqlite;
    EditText id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_eliminar, container, false);

        eliminar = (Button)view.findViewById(R.id.btneliminar);
        id= (EditText)view.findViewById(R.id.ideliminar);
        eliminar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sqlite= new SQLite(getContext());
                sqlite.abrir();
                if(id.getText().toString()!=null){
                    sqlite.Eliminar(id.getText());
                    Toast.makeText(getContext(), "Registro eliminado",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getContext(),"Ingrese el campo del ID",Toast.LENGTH_SHORT).show();
                }
            }

        });
        return view;
    }
}
