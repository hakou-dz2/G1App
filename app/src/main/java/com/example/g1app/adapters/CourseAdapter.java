package com.example.g1app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g1app.struct.Course;
import com.example.g1app.R;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {
    List<Course> courses;

    public CourseAdapter(List<Course> courses, OnItemClickListener listener) {
        this.courses = courses;
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(Course course);
    }

    OnItemClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(courses.get(position).getName());
        holder.grade.setText(courses.get(position).getGrade().toString());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(courses.get(position));

            }
        });
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, grade;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            grade = itemView.findViewById(R.id.tv_grade);
            cardView = itemView.findViewById(R.id.card);
        }
    }
}
