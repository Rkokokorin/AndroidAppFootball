package com.example.fotballap.Logic.domain.persons;



import com.example.fotballap.Logic.Tournaments.Tournament;

import java.util.HashMap;
import java.util.Map;


public class Player extends Person  {
    int id = Persons.Players.size();
        private String position;
    private int games;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
    private String name;


    Player(String name){
        position ="Неизвестна";
        this.name=name;
        Persons.PlayerNameMap.put(this.name,this);
        Persons.Players.add(this);
            }
      public Player(String name, int goals, int games, int ass, int Red_cards, int Yellow_cards, String pos){
                this.name= name;
                this.goals=goals;
                this.games=games;
                assists=ass;
                redCards=Red_cards;
                yellowCards=Yellow_cards;
                position =pos;

                Persons.Players.add(this);
                Persons.PlayerNameMap.put(this.name,this);
                Persons.PlayersSortedByGoals.add(this);
            }

    public void setGames(int games) {
        this.games = games;
    }

    public void setGoals(int goals) {
        this.goals = goals;

        Persons.Players.add(this);
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public int getGames() {
        return games;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

