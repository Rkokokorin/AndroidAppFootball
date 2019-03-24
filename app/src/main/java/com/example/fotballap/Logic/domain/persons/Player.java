package com.example.fotballap.Logic.domain.persons;

import java.util.HashMap;
import java.util.Map;

public class Player extends Person {
    String position;
    Map<String,Integer> statistic = new HashMap<>();

    Player(String name, String surname){
        statistic.put("Goals",0);
        statistic.put("Assists",0);
        statistic.put("Red_cards", 0);
        statistic.put("Yellow cards",0);
        statistic.put("Goals_Previous_Season",0);
        statistic.put("Assists_Previous_Season",0);
        statistic.put("Red_cards_Previous_Season", 0);
        statistic.put("Yellow_cards_Previous_Season",0);
        position ="Неизвестна";
        name=this.name;
        surname = this.surname;
            }
      Player(String name, String surname, int goals, int assists,int Red_cards, int Yellow_cards,String pos){
                statistic.put("Goals",goals);
                statistic.put("Assists",assists);
                statistic.put("Red_cards", Red_cards);
                statistic.put("Yellow cards",Yellow_cards);
                name=this.name;
                surname = this.surname;
                position =pos;
            }

}

