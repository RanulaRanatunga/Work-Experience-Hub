package com.example.workexperiencehub.ui.team;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.example.workexperiencehub.MainActivity;
import com.example.workexperiencehub.R;
import com.example.workexperiencehub.Teams;
import com.example.workexperiencehub.customTeamListView;
import java.util.ArrayList;
import java.util.List;

public class TeamFragment extends Fragment {

    ListView teamlst;

    List<Teams> teamsList;

    private teamViewModel teamViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teamViewModel =  ViewModelProviders.of(this).get(teamViewModel.class);

        MainActivity.getInstance().changeToolbarTittle("TEAM");

        View root = inflater.inflate(R.layout.fragment_team, container, false);

        teamlst = (ListView) root.findViewById(R.id.team_list);

        teamsList = new ArrayList<>();

        Teams temZero = new Teams(R.drawable.ravi, "Ravisarani Ranawaka" ,"SENIOR iOS DEVELOPER");
        Teams temOne = new Teams(R.drawable.prabath, "Prabath Gunasekara" ,"WEB AND GRAPHIC DESIGNER");
        Teams temTwo = new Teams(R.drawable.nuwan, "Nuwan Aluthgama", "WEB AND GRAPHIC DESIGNER");
        Teams temThree = new Teams(R.drawable.amal, "Amal Madawa", "SENIOR ANDROID DEVELOPER");
        Teams temFour = new Teams(R.drawable.nirosha, "Nirosha Kodithuwakku", "CEO");
        Teams temFive = new Teams(R.drawable.dummy_female, "Nirosha Abeyrathne", "PROJECT MANAGER");
        Teams temSix = new Teams(R.drawable.kalinda, "Kalinda Abeynayake", "MARKETING MANAGER");
        Teams temSeven = new Teams(R.drawable.vayshnavi, "Viashnavi Thangaraj", "ACCOUNT EXECUTIVE");
        Teams temEight = new Teams(R.drawable.chamith, "Chamith Jayasignhe", "JUNIOR iOS ANDROID DEVELOPER");
        Teams temNine = new Teams(R.drawable.ranula, "Ranula Ranatunga", "JUNIOR iOS ANDROID DEVELOPER");
        Teams temTen = new Teams(R.drawable.nipun, "Nipun Sangeeth","WEB BACK END DEVELOPER");
        Teams temEleven = new Teams(R.drawable.vira, "Viraj Kalahara" ,"SENIOR WEB DEVELOPER");


        teamsList.add(temFour);
        teamsList.add(temFive);
        teamsList.add(temSix);
        teamsList.add(temSeven);
        teamsList.add(temZero);
        teamsList.add(temOne);
        teamsList.add(temTwo);
        teamsList.add(temThree);
        teamsList.add(temEight);
        teamsList.add(temNine);
        teamsList.add(temTen);
        teamsList.add(temEleven);


        customTeamListView adapter = new customTeamListView(getContext(), R.layout.team_design, teamsList);

        teamlst.setAdapter(adapter);

       teamlst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

             Teams teams = teamsList.get(position);

             String teamName = teams.getTeamName();
             String teamOccupation = teams.getTeamOccupation();
             int teamImages = teams.getTeamImage();

             FragmentManager fragmentManager = getFragmentManager();
             FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


//             teamMembers teamMembers = new teamMembers();

             Bundle bundle = new Bundle();
             bundle.putString("teamName" ,teamName);
             bundle.putString("teamOccupation" , teamOccupation);
             bundle.putInt("teamImage" ,teamImages);

//             teamMembers.setArguments(bundle);

//             fragmentTransaction.replace(R.id.nav_host_fragment ,teamMembers);

//             fragmentTransaction.commit();

         }
     });


        return root;
    }

}