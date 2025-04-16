package com.example.g1app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.g1app.R;
import com.example.g1app.adapters.CourseAdapter;
import com.example.g1app.struct.Course;

import java.util.ArrayList;
import java.util.List;


public class ListFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.list_course);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Course 1", 15.0, 3.0, 1.0));
        courses.add(new Course("Course 2", 16.0, 4.0, 2.0));
        courses.add(new Course("Course 3", 17.0, 5.0, 3.0));
        courses.add(new Course("Course 4", 18.0, 6.0, 4.0));
        courses.add(new Course("Course 5", 19.0, 3.0, 5.0));
        courses.add(new Course("Course 6", 10.0, 2.0, 6.0));
        courses.add(new Course("Course 7", 11.0, 1.0, 5.0));
        courses.add(new Course("Course 8", 12.0, 2.0, 4.0));
        courses.add(new Course("Course 9", 13.0, 3.0, 3.0));
        courses.add(new Course("Course 10", 14.0, 4.0, 2.0));

        CourseAdapter adapter = new CourseAdapter(courses, (CourseAdapter.OnItemClickListener) this.getActivity());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }
}