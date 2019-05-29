package com.example.fotballap.Logic.domain.teams;

import java.util.ArrayList;

public class Matches {
     public  static  ArrayList<Match> matches= new ArrayList<>();
    public static void  createMatches(){
        Match m1 = new Match("10.05.2019","Зенит","Спартак",3,2);
        Match m2 = new Match("12.05.2019","Шинник","Итмо",1,2);
        Match m3 = new Match("14.05.2019","Бавария","Барселона",1,0);
        Match m4 = new Match("15.05.2019","Фк Радуга","Атлетико",3,2);
        Match m5 = new Match("29.05.2019","Зенит","Итмо");
        Match m6 = new Match("03.06.2019","Спартак","Бавария");
        Match m7 = new Match("05.06.2019","Ателетико","Бавария");
        Match m8 = new Match("06.06.2019","Атлетико","Барселона");


    }
}
