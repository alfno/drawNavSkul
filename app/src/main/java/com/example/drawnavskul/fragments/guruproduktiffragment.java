package com.example.drawnavskul.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawnavskul.adapter;
import com.example.drawnavskul.model;
import com.example.drawnavskul.R;

import java.util.ArrayList;


public class guruproduktiffragment extends Fragment implements adapter.RecyclerViewClickListener {
    ArrayList<model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_guru_produktif, container, false);
        RecyclerView recyclerView = rootview.findViewById(R.id.recyclerView);

        model.add(new model("Pak Dwi","Informatika", R.drawable.man));
        model.add(new model("Pak Agus","Desktop", R.drawable.man));
        model.add(new model("Pak Anjas","Game", R.drawable.man));
        model.add(new model("Pak Aji","Mobile", R.drawable.man));
        model.add(new model("Pak Fahmi","Website", R.drawable.man));


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(), model, this);
        recyclerView.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}
