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

public class guruFragment extends Fragment implements adapter.RecyclerViewClickListener {
    ArrayList<model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_guru_, container, false);
        RecyclerView recyclerView = rootview.findViewById(R.id.recyclerView);

        model.add(new model("pak jamil", "IPAS", R.drawable.man));
        model.add(new model("bu dila", "Agama", R.drawable.cewe));
        model.add(new model("bu unnik", "pancasila", R.drawable.cewe));
        model.add(new model("pak firawan", "Matematika", R.drawable.man));
        model.add(new model("bu vita", "sejarah", R.drawable.cewe));
        model.add(new model("bu rike", "japan", R.drawable.cewe));
        model.add(new model("bu widi", "B jawa", R.drawable.cewe));
        model.add(new model("pak ariyo", "B inggris", R.drawable.man));
        model.add(new model("pak ariyo", "B indo", R.drawable.man));
        model.add(new model("pak imam", "Olahraga", R.drawable.man));


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(), model, this);
        recyclerView.setAdapter(adapter);

        return rootview;

    }

    @Override
    public void onClick(View view, int position) {

    }
}