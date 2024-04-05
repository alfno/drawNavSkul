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

public class muridfragment extends Fragment implements adapter.RecyclerViewClickListener {
    ArrayList<model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_murid, container, false);
        RecyclerView recyclerView = rootview.findViewById(R.id.recyclerView);

        model.add(new model("Eren","10PPLG2", R.drawable.person));
        model.add(new model("Dzaky","10PPLG2", R.drawable.person));
        model.add(new model("Firasi","10PPLG2", R.drawable.person));
        model.add(new model("Pirlo","10PPLG2", R.drawable.person));
        model.add(new model("Azzam","10PPLG2", R.drawable.person));
        model.add(new model("Najib","10PPLG2", R.drawable.person));
        model.add(new model("Nabil","10PPLG2", R.drawable.person));
        model.add(new model("kaisar","10PPLG2", R.drawable.person));
        model.add(new model("Wisnu","10PPLG2", R.drawable.person));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(), model, this);
        recyclerView.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}
