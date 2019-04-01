package com.example.fotballap.Logic.domain.persons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Persons {
  public static class ComparatorByGoals implements Comparator<Player>{
      @Override
      public int compare(Player p1, Player p2) {


         return (p1.getGames()-p2.getGames());
      }}
      private static ComparatorByGoals comparatorByGoals= new ComparatorByGoals();

   public static  ArrayList<Player>  Players= new ArrayList<>();
   public static ArrayList<Player> PlayersSortedByGoals = new ArrayList<Player>();
public  static void  createPlayers(){
    Player player = new Player("АлександрКержаков",1,4,5,0,5,"Нападающий");
    Player player2 = new Player("АлександрКокорин",4,4,0,0,0,"Защитник");
    Player player3 = new Player("Александр Петров",3,4,5,0,2,"Полузащитник");
    Player player4 = new Player("Антоn Кержаков",2,4,5,1,0,"Нападающий");
    Player player5 = new Player("Роман Kокорин",20,4,5,0,1,"Нападающий");
    Player playher = new Player("АлександрКержаков",11,4,5,0,5,"Нападающий");
    Player playery = new Player("АлександрКокорин",3,4,0,0,0,"Защитник");
    Player playekjr3 = new Player("Александр Петров",4,4,5,0,2,"Полузащитник");
    Player plagyer4 = new Player("Антоn Кержаков",6,4,5,1,0,"Нападающий");
    Player plagyer5 = new Player("Роман Kокорин",6,4,5,0,1,"Нападающий");
    Player playfer = new Player("АлександрКержаков",5,4,5,0,5,"Нападающий");
    Player plafyer2 = new Player("АлександрКокорин",3,4,0,0,0,"Защитник");
    Player playerf3 = new Player("Александр Петров",8,4,5,0,2,"Полузащитник");
    Player plader4 = new Player("Антоn Кержаков",3,4,5,1,0,"Нападающий");
    Player playfer5 = new Player("Роман Kокорин",10,4,5,0,1,"Нападающий");

}

}
