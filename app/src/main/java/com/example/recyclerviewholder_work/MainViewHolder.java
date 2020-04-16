package com.example.recyclerviewholder_work;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView surname;
    private TextView group;
    private StudentsFullInformation SFI;
    onClick listener;

    Main2Activity main2Activity;

    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        surname = itemView.findViewById(R.id.surname);
        group = itemView.findViewById(R.id.group);

        main2Activity = new Main2Activity();
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.click(getAdapterPosition(), SFI);
            }
        });
    }

    public void onBind(StudentsFullInformation SFI) {
        this.SFI = SFI;
        name.setText(SFI.getName());
        surname.setText(SFI.getSurname());
        group.setText(SFI.getGroup());
    }
}
