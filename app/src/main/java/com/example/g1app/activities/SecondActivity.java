package com.example.g1app.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g1app.fragments.InfoFragment;
import com.example.g1app.struct.Course;
import com.example.g1app.adapters.CourseAdapter;
import com.example.g1app.R;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements CourseAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);





    }

    @Override
    public void onItemClick(Course course) {
        FragmentTransaction fragmentController = getSupportFragmentManager().beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("name", course.getName());
        bundle.putDouble("grade", course.getGrade());
        bundle.putDouble("credit", course.getCredit());
        bundle.putDouble("Coeff", course.getCoeff());

        InfoFragment infoFragment = new InfoFragment();
        infoFragment.setArguments(bundle);

        fragmentController.replace(R.id.frag_cont, infoFragment);
        fragmentController.addToBackStack(null);
        fragmentController.commit();








    }
}