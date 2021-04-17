package com.example.myproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlanningFragment extends Fragment {
    public PlanningFragment() {
    }

    public static PlanningFragment newInstance() {
        return new PlanningFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planning, container, false);
    }
}