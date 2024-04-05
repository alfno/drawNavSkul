package com.example.drawnavskul;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
    Context context;
    ArrayList<model> model = new ArrayList<>();
    private RecyclerViewClickListener mListener;

    public adapter(Context context, ArrayList<model> model, RecyclerViewClickListener listener) {
        this.context = context;
        this.model = model;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_murid, parent, false);
        return new adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.MyViewHolder holder, final int position) {

        holder.tvname.setText(model.get(position).getName());
        holder.tvkelas.setText(model.get(position).getKelas());
        Glide.with(context).load(model.get(position).getImg()).into(holder.imagesbangundatar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imagesbangundatar;
        TextView tvname;
        TextView tvkelas;



        public MyViewHolder(View ItemView) {
            super(ItemView);
            imagesbangundatar = itemView.findViewById(R.id.imageView);
            tvname = itemView.findViewById(R.id.textViewName);
            tvkelas = itemView.findViewById(R.id.textViewType);
        }
    }
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}
