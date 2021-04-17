package com.example.myproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProfileFragment extends Fragment {
    public ProfileFragment() { }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    // Форма для входа в аккаунт
    private Dialog showSignWindow()
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("To come in");
        dialog.setMessage("Enter your login information");

        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View registerWindow = inflater.inflate(R.layout.to_come_in, null);
        dialog.setView(registerWindow);

        View username = registerWindow.findViewById(R.id.username);
        View password = registerWindow.findViewById(R.id.password);

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.setPositiveButton("ENTER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        return dialog.show();
    }

    // Форма для регистрации
    private Dialog showRegisterWindow()
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("Authorization");
        dialog.setMessage("Enter all registration data");

        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View registerWindow = inflater.inflate(R.layout.create_an_account, null);
        dialog.setView(registerWindow);

        View username = registerWindow.findViewById(R.id.username);
        View password = registerWindow.findViewById(R.id.password);

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        return dialog.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View profile_view =  inflater.inflate(R.layout.fragment_profile, container, false);

        Button btnRegister = profile_view.findViewById(R.id.btnRegister);
        Button btnSign     = profile_view.findViewById(R.id.btnSign);

        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                showRegisterWindow();
            }
        });

        btnSign.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                showSignWindow();
            }
        });

        return profile_view;
    }
}