package com.example.sebnem.loginpage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Login extends Fragment {
View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_login, container, false);

        Button login = v.findViewById(R.id.login_btn);
        TextView creaate = v.findViewById(R.id.create_account);

        Fragment aboutMe = new AboutMe();
        Fragment create = new Create();



        login.setOnClickListener(view -> {
            setFragment(aboutMe);
        });

        creaate.setOnClickListener(view -> {
            setFragment(create);
        });

        return  v;
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}