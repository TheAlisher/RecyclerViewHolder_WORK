package com.example.recyclerviewholder_work;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<StudentsFullInformation> list;
    onClick onClick;

    public MainAdapter() {
        list = new ArrayList<>();
        /*for (int i = 0; i < data.size(); i++) {
            int rangeFrom = 1;
            int rangeTo = 10;
            int randomGroup = rangeFrom + (int) (Math.random() * rangeTo);
        }*/
        /*data.add("Christian Bale | " + "g:" + 3);
        data.add("Sebastian Stane | " + "g: " + 2);
        data.add("James Holiday | " + "g:" + 5);
        data.add("Robert Downey jr | " + "g:" + 2);
        data.add("Chris Evans | " + "g:" + 7);*/
    }

    public void update(ArrayList<StudentsFullInformation> studentsFullInformation) {
        list = studentsFullInformation;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder holder = new MainViewHolder(view);
        holder.listener = onClick;
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.listener = onClick;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
