package com.test.seungyongson.recycler.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.seungyongson.recycler.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seungyong Son on 2018-01-19.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    List<Student> items = new ArrayList<>();

    public void add(Student data){
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(
                parent.getContext()).inflate(R.layout.item_recycler, parent, false
        );

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student item = items.get(position);
        holder.mStudentNameText.setText(item.getName());
        holder.mScoreText.setText(item.getScore());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
