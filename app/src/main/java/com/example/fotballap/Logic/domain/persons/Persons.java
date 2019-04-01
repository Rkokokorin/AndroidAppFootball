package com.example.fotballap.Logic.domain.persons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
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
   public static Map<String,Player> PlayerNameMap = new HashMap<>();
   public static ArrayList<Player> PlayersSortedByGoals = new ArrayList<Player>();
public  static void  createPlayers(){
    Player player = new Player("Александр Кержаков",1,20,5,0,5,"Нападающий");
    Player player2 = new Player("Александр Кокорин",4,20,0,0,0,"Защитник");
    Player player3 = new Player("Арсений Порядин",3,20,5,0,2,"Полузащитник");
    Player player4 = new Player("Лионель Месси",2,20,5,1,0,"Нападающий");
    Player player5 = new Player("Роман Kокорин",20,20,5,0,1,"Нападающий");
    Player playher = new Player("Виктор Хрулев",19,4,5,0,5,"Нападающий");
    Player playery = new Player("Хавьер Дзанетти",3,18,0,0,0,"Защитник");
    Player playekjr3 = new Player("Низовцев Иван",4,17,5,0,2,"Полузащитник");
    Player plagyer4 = new Player("Лука Джорджевич",6,20,5,1,0,"Нападающий");
    Player plagyer5 = new Player("Виктор Понедельник",6,19,5,0,1,"Нападающий");
    Player playfer = new Player("Златан Ибрагимович",5,19,5,0,5,"Нападающий");
    Player plafyer2 = new Player("Серхио Агуэро",3,16,0,0,0,"Защитник");
    Player playerf3 = new Player("Александр Петров",8,20,5,0,2,"Полузащитник");
    Player plader4 = new Player("Николай Никитин",3,11,5,1,0,"Нападающий");
    Player playfer5 = new Player("Халк",10,20,5,0,1,"Нападающий");

}

}
