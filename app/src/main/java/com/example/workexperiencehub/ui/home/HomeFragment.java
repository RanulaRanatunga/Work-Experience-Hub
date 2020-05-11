package com.example.workexperiencehub.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.workexperiencehub.AndroidDevelopment;
import com.example.workexperiencehub.GraphicDesign;
import com.example.workexperiencehub.IosDevelopment;
import com.example.workexperiencehub.MainActivity;
import com.example.workexperiencehub.ProjectManagement;
import com.example.workexperiencehub.R;
import com.example.workexperiencehub.SocialMedia;
import com.example.workexperiencehub.WebDevelopment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        MainActivity.getInstance().changeToolbarTittle("WORK EXPERIENCE HUB");

        Button androidButton = (Button) root.findViewById(R.id.apply_android);
        androidButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                switch(v.getId()){

                    case R.id.apply_android:
                        Intent android = new Intent(getActivity() , AndroidDevelopment.class);
                        startActivity(android);
                        break;
                }
            }
        });


        Button iosButton = (Button) root.findViewById(R.id.apply_ios);
        iosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.apply_ios:
                        Intent ios = new Intent(getActivity(), IosDevelopment.class);
                        startActivity(ios);
                        break;
                }
            }
        });

        Button graphicButton = (Button) root.findViewById(R.id.apply_graphic);
        graphicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.apply_graphic:
                        Intent graphic = new Intent(getActivity(), GraphicDesign.class);
                        startActivity(graphic);
                        break;
                }
            }
        });


        Button webButton  = (Button) root.findViewById(R.id.apply_web);
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case  R.id.apply_web:
                        Intent web = new Intent(getActivity(), WebDevelopment.class);
                        startActivity(web);
                        break;
                }
            }
        });


        Button projectButton  = (Button) root.findViewById(R.id.apply_projectmanagement);
        projectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case  R.id.apply_projectmanagement:
                        Intent project = new Intent(getActivity(), ProjectManagement.class);
                        startActivity(project);
                        break;
                }
            }
        });


        Button socialButton  = (Button) root.findViewById(R.id.apply_socialmedia);
        socialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case  R.id.apply_socialmedia:
                        Intent project = new Intent(getActivity(), SocialMedia.class);
                        startActivity(project);
                        break;
                }
            }
        });


        return root;
    }

}