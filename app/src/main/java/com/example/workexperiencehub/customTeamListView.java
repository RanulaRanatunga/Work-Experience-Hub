package com.example.workexperiencehub;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class customTeamListView extends ArrayAdapter<Teams> {


    List<Teams> teamList;

    Context context;

    int resource;

    Button Button_Bio;


    public customTeamListView(@NonNull Context context, int resource , List<Teams> teamList) {

        super(context,resource,teamList);
        this.context = context;
        this.resource = resource;
        this.teamList =teamList;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource , null ,false);


        ImageView team_img = view.findViewById(R.id.team_img);
        TextView team_name = view.findViewById(R.id.teamname);
        TextView team_occupation = view.findViewById(R.id.teamoccupation);

        Teams teams = teamList.get(position);

        team_img.setImageDrawable(context.getResources().getDrawable(teams.getTeamImage()));
        team_name.setText(teams.getTeamName());
        team_occupation.setText(teams.getTeamOccupation());


        return view;
    }

}
