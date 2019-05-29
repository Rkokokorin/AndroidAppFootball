package com.example.fotballap.Logic.domain.teams;

public class Match {
    private String Date;
    private String team1;
    private String team2;
    private int team1Score;
    private int team2Score;
    public Match(String date, String team1, String team2) {
        Date = date;
        this.team1 = team1;
        this.team2 = team2;
    team1Score =-1;
    team2Score = -1;
        Matches.matches.add(this);}
    public Match(String date, String team1, String team2, int team1Score, int team2Score) {
        Date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        Matches.matches.add(this);
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
