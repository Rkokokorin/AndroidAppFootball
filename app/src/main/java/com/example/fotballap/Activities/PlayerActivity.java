package com.example.fotballap.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.fotballap.Logic.domain.persons.Person;
import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.persons.Player;
import com.example.fotballap.R;

import org.w3c.dom.Text;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findplayer_dialog);
       Player player = Persons.PlayerNameMap.get(FindPlayerActivity.name);
      TextView nametextview = findViewById(R.id.name);
//       TextView surnametextview = findViewById(R.id.surname);
        TextView gamestextview = findViewById(R.id.playergames);
        TextView teamtextview = findViewById(R.id.team);
        TextView positiontextview = findViewById(R.id.playerposition);
        TextView goalstextview = findViewById(R.id.playergoals);
        TextView assiststextview = findViewById(R.id.playerassists);
        TextView yelcardtextview = findViewById(R.id.playeryellowcards);
        TextView redcardstextview = findViewById(R.id.playerredcards);
//if (player!= null) {
   nametextview.setText(player.getName());
   teamtextview.setText(player.getTeam());
   positiontextview.setText(player.getPosition());
goalstextview.setText(String.valueOf(player.getGoals()));
    assiststextview.setText(String.valueOf(player.getAssists()));
   yelcardtextview.setText(String.valueOf(player.getYellowCards()));
    redcardstextview.setText(String.valueOf(player.getRedCards()));
    gamestextview.setText(String.valueOf(player.getGames()));
//}
    }

}
