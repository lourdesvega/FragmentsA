package com.example.zoologico;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Listar.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Listar extends Fragment {


    public Listar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_listar, container, false);
        ListView l = (ListView)view.findViewById(R.id.lista);
        //Agregar ListView
        SQLite sqlite;
        sqlite= new SQLite(getContext());
        sqlite.abrir();
        Cursor cursor = sqlite.getRegistro();
        ArrayList<String> reg = sqlite.getAnimal(cursor);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,reg);
        l.setAdapter(adaptador);

        return view;

    }

}
