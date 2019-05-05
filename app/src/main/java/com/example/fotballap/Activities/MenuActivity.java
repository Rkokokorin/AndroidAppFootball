package com.example.fotballap.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.R;


public class MenuActivity extends AppCompatActivity {

    //Создаем массив разделов:
    private String titles[] = {
            " Поиск игрока",
//            " Создать турнир",
            " Турнирная таблица",
            " Рейтинг Игроков",
            " Добавить игрока",
            " Поиск команды",
            " Ближайшие матчи",
            " Об авторе",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Получим идентификатор ListView
        ListView listView = findViewById(R.id.listView);
        //устанавливаем массив в ListView
        listView.setAdapter(
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles));
        listView.setTextFilterEnabled(true);

        //Обрабатываем щелчки на элементах ListView:
   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         public void onItemClick(AdapterView<?> a, View v, int position, long id) {
   Intent intent = new Intent();
//
      switch (position) {
             case 0:{
                    intent.setClass(MenuActivity.this, FindPlayerActivity.class);
                    break;}
                    case 1:
                    intent.setClass(MenuActivity.this, TournamentTableActivity.class);
                    break;
                case 2: {
                    intent.setClass(MenuActivity.this, RaitingActivity.class);
                    break;
                }
//                 case 3:
//                     intent.setClass(MenuActivity.this, AddPlayerActivity.class);
//                 case 4:
//                     intent.setClass(MenuActivity.this, FindTeamActivity.class);
//                 case 5:
//                     intent.setClass(MenuActivity.this, SheduleActivity.class);
//                 case 6:
//                     intent.setClass(MenuActivity.this, AboutActivity.class);
//////                //запускаем  активность
}
          startActivity(intent);


         }});
    }
}