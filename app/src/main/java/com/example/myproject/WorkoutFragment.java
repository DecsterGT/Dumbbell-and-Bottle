package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class WorkoutFragment extends Fragment implements View.OnClickListener{
    public WorkoutFragment() {
    }

    public static WorkoutFragment newInstance() {
        return new WorkoutFragment();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), WorkoutNotes.class);
        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workoutWindow = inflater.inflate(R.layout.fragment_workout, container, false);

        ImageButton btnAdd = workoutWindow.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this::onClick);

        return workoutWindow;
    }
}