package com.example.planner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class infoadapter extends RecyclerView.Adapter<infoadapter.Viewholder> {
    ArrayList<info> items = new ArrayList<>();
    public infoadapter(){}

    @NonNull

    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.todo_item, parent, false);
        return new Viewholder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull infoadapter.Viewholder holder, int position) {
        holder.onBind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void additem(info info){
        items.add(info);
        notifyDataSetChanged();

    }


    public class Viewholder extends RecyclerView.ViewHolder{
        CheckBox checkBox;

        public Viewholder(View itemView){
            super(itemView);
            checkBox=itemView.findViewById(R.id.checkBox);

        }
        public void onBind(info info){
            checkBox.setText(info.getInfo());
        }

    }
}
