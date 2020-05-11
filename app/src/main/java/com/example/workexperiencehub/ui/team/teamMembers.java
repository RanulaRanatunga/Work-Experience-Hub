package com.example.workexperiencehub.ui.team;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.workexperiencehub.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class
teamMembers extends Fragment {

    public teamMembers() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


       View view =  inflater.inflate(R.layout.fragment_team_members, container, false);

        Bundle bundle = getArguments();

        String temName = bundle.getString("teamName");
        String tJob = bundle.getString("teamOccupation");
        int tImage = bundle.getInt("teamImage" ,0);

        ImageView  teamProfile = view.findViewById(R.id.profile_image);

        TextView teamName = view.findViewById(R.id.team_name);

        TextView teamOccupation = view.findViewById(R.id.job_profile);

        teamProfile.setImageResource(tImage);
        teamName.setText(temName);
        teamOccupation.setText(tJob);


        return view;
    }
}
