package com.example.recycleprovinsitest;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private LayoutInflater layoutInflater;
    private List<String> data;

    Adapter(Context context,List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView namaProvinsi, totalKasus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaProvinsi = itemView.findViewById(R.id.namaProvinsi);
            totalKasus = itemView.findViewById(R.id.totalKasus);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_card,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        String namaProv = data.get(position);
        viewHolder.namaProvinsi.setText(namaProv);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
