package com.example.g1app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.g1app.R;


public class InfoFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView name = view.findViewById(R.id.tv_info_name);
        TextView grade = view.findViewById(R.id.tv_info_grade);
        TextView credits = view.findViewById(R.id.tv_info_cred);
        TextView coeff = view.findViewById(R.id.tv_info_coeff);

        Bundle bundle = getArguments();

        name.setText(bundle.getString("name"));
        grade.setText(String.valueOf(bundle.getDouble("grade")));
        credits.setText(String.valueOf(bundle.getDouble("credit")));
        coeff.setText(String.valueOf(bundle.getDouble("Coeff")));
    }
}