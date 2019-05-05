package com.example.fotballap.Logic.domain.teams;

import java.util.ArrayList;

public class Teams {
    public static  ArrayList<Team> sortedTeams = new ArrayList<>();
    public static void createTeams(){
        Team t1 = new Team("Зенит",10,5,0,15,5);
        Team t2 = new Team("Спартак",9,6,0,15,5);
        Team t3 = new Team("Бавария",5,3,2,15,5);
        Team t4 = new Team("Шиник",1,5,6,15,5);
        Team t5 = new Team("Барселона",6,3,4,15,5);
        Team t6 = new Team("Атлетико",6,6,6,15,5);
        Team t7 = new Team("Газмяс",7,5,7,15,5);
        Team t8 = new Team("Фк Радуга",6,6,2,15,5);
        Team t9 = new Team("Итмо",8,5,6,15,5);
    }
}
