package com.example.workexperiencehub.ui.employers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.workexperiencehub.MainActivity;
import com.example.workexperiencehub.R;

public class EmployersFragment extends Fragment {

    private EmployersViewModel employersViewModel;
    private Object ImageView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        employersViewModel =
                ViewModelProviders.of(this).get(EmployersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_employers, container, false);

       MainActivity.getInstance().changeToolbarTittle("EMPLOYERS");

        ImageView imgcardiff= (ImageView) root.findViewById(R.id.img_cardiff);
        imgcardiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.cardiffappdevelopers.com/"));
                getActivity().startActivity(intent);
            }
        });


        ImageView imgarchmage = (ImageView) root.findViewById(R.id.img_archamage);
        imgarchmage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://archmage.lk/"));
                getActivity().startActivity(intent);
            }
        });
        return root;
    }
}