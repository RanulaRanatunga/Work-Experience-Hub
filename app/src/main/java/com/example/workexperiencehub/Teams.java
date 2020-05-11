package com.example.workexperiencehub;

public class Teams {

    private int  teamImage;
    private String teamName;
    private String teamOccupation;

    public Teams(int teamImage, String teamName, String teamOccupation)
    {
        this.teamImage = teamImage;
        this.teamName = teamName;
        this.teamOccupation = teamOccupation;
    }

    public int getTeamImage() {

        return teamImage;
    }

    public String getTeamName() {

        return teamName;
    }

    public String getTeamOccupation() {

        return teamOccupation;
    }
}
