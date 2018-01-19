package com.test.seungyongson.recycler.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.test.seungyongson.recycler.R;

/**
 * Created by Seungyong Son on 2018-01-19.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView mStudentNameText, mScoreText;

    public ViewHolder(View itemView){
        super(itemView);
        mStudentNameText = (TextView) itemView.findViewById(R.id.text_student_name);
        mScoreText = (TextView) itemView.findViewById(R.id.text_score);
    }
}
