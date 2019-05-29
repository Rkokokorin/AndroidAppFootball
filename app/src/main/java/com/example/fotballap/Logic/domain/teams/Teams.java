package com.example.fotballap.Logic.domain.teams;

import com.example.fotballap.Logic.domain.persons.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teams {
    public static Map<String,Team> TeamMap = new HashMap<>();
    public static  ArrayList<Team> sortedTeams = new ArrayList<>();
    public static void createTeams(){
        Team t1 = new Team("Зенит",10,5,0,15,5,"Андрей Аршавин","zenit");
        Team t2 = new Team("Спартак",9,6,0,15,5,"Луис Адриано","spartak");
        Team t3 = new Team("Бавария",5,3,2,15,5,"Франк Рибери","bayern");
        Team t4 = new Team("Шинник",1,5,6,15,5,"Андрей Таллалаев","shinnik");
        Team t5 = new Team("Барселона",6,3,4,15,5,"Андреас Иньеста","barcelona");
        Team t6 = new Team("Атлетико",6,6,6,15,5,"Диего Годин","atletico");
        Team t7 = new Team("Газмяс",7,5,7,15,5,"Арсений Порядин");
        Team t8 = new Team("Фк Радуга",6,6,2,15,5,"Адам Лаллана");
        Team t9 = new Team("Итмо",8,5,6,15,5,"Виктор Хрулев","itmo");
    }
}
