package com.example.workexperiencehub.ui.projects;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.workexperiencehub.MainActivity;
import com.example.workexperiencehub.R;

public class ProjectsFragment extends Fragment {

    private ProjectsViewModel projectsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        projectsViewModel =
                ViewModelProviders.of(this).get(ProjectsViewModel.class);

        MainActivity.getInstance().changeToolbarTittle("PROJECTS");

   View root = inflater.inflate(R.layout.fragment_projects, container, false);


        return root;
    }
}