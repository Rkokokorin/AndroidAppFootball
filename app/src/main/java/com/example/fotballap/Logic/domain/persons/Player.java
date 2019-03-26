package com.example.fotballap.Logic.domain.persons;


import com.example.fotballap.Logic.Raiting;
import com.example.fotballap.Logic.Tournaments.Tournament;

import java.util.HashMap;
import java.util.Map;


public class Player extends Person {
    int id = Raiting.goals.size();
    private String position;
    private int games;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
    Map<String,Integer> statistic = new HashMap<>();

    Player(String name, String surname){
              position ="Неизвестна";
        name=this.name;
        surname = this.surname;
        Persons.Players.add(this);
            }
      public Player(String name, String surname, int goals, int games, int ass, int Red_cards, int Yellow_cards, String pos){
                this.name= name;
                this.surname=surname;
                this.goals=goals;
                this.games=games;
                assists=ass;
                redCards=Red_cards;
                yellowCards=Yellow_cards;
                position =pos;
                Raiting.goals.put(id,goals);
                Persons.Players.add(this);
            }

    public void setGames(int games) {
        this.games = games;
    }

    public void setGoals(int goals) {
        this.goals = goals;
        Raiting.goals.put(id,goals);
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
}

