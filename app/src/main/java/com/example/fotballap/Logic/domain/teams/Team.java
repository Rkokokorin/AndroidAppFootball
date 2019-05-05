package com.example.fotballap.Logic.domain.teams;

public class Team {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int id;
    private int loses;
    private  int goals;
    private int inGoals;
    private int wins;
    private int  draws;
    private int points;

    public int getGames() {
        return games;
    }

    private int games;

    public int getPoints() {
        return points;
    }

    public Team(String name , int wins, int draws, int loses, int goals, int inGoals) {
        id = Teams.sortedTeams.size();
        this.name = name;
        this.loses = loses;
        this.goals = goals;
        this.inGoals = inGoals;
        this.wins = wins;
        this.draws = draws;
        this.games = wins+ draws + loses;
        points =wins*3+draws;
        Teams.sortedTeams.add(this);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getInGoals() {
        return inGoals;
    }

    public void setInGoals(int inGoals) {
        this.inGoals = inGoals;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
