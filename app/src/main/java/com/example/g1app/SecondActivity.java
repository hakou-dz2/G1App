package com.example.g1app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        RecyclerView recyclerView = findViewById(R.id.list_course);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Course 1", 15.0));
        courses.add(new Course("Course 2", 16.0));
        courses.add(new Course("Course 3", 17.0));
        courses.add(new Course("Course 4", 18.0));
        courses.add(new Course("Course 5", 19.0));
        courses.add(new Course("Course 6", 10.0));
        courses.add(new Course("Course 7", 11.0));
        courses.add(new Course("Course 8", 12.0));
        courses.add(new Course("Course 9", 13.0));
        courses.add(new Course("Course 10", 14.0));

        CourseAdapter adapter = new CourseAdapter(courses);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}