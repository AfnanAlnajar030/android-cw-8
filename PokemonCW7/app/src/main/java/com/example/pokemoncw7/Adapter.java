package com.example.pokemoncw7;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    ArrayList<Pokemon> mPokemon;

    // Constructor
    public Adapter(ArrayList<Pokemon> mPokemon ) {
        this.mPokemon = mPokemon;
    }

    // Required methods
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // This method gives data to each item in it based on the 'position' which is the index..?
        ((ViewHolder) holder).image.setImageResource(mPokemon.get(position).getImage());
        ((ViewHolder) holder).name.setText(mPokemon.get(position).getName());
        ((ViewHolder) holder).total.setText(mPokemon.get(position).getTotal() + "");



    }

    @Override
    public int getItemCount() {
        return mPokemon.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView name;
        public TextView total;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.imageView);
            total = itemView.findViewById(R.id.total);
        }
    }


}
