package com.example.finalproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter {

    ArrayList<Books> bArray;
    Context context;

    public BookAdapter(ArrayList<Books> bArray, Context context){
        this.bArray = bArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklist,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(bArray.get(position).getImage());
        ((ViewHolder) holder).recommended.setText(bArray.get(position).getRecommend()+"%");
        ((ViewHolder) holder).name.setText(bArray.get(position).getName()+"");
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Details.class);

                i.putExtra("books",bArray.get(position));

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img ;
        public TextView name ;
        public TextView recommended ;
        public View view ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView3);
            recommended = itemView.findViewById(R.id.textView);
        }
    }
}
