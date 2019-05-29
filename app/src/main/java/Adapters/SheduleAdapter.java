package Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.Logic.domain.persons.Player;
import com.example.fotballap.Logic.domain.teams.Team;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

import com.example.fotballap.Logic.domain.teams.Match;
import com.example.fotballap.Logic.domain.teams.Matches;
import com.example.fotballap.Logic.domain.teams.Team;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;


public class SheduleAdapter extends RecyclerView.Adapter<SheduleAdapter.TableViewHolder>{
    private int numbersOfItems;
    Context context;
    public SheduleAdapter(int numbersOfItems, Context context){
        this.numbersOfItems=numbersOfItems;
        this.context = context;
    }

    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Context context =parent.getContext();
        int layoutIdForListItem=R.layout.matchelementlayout;
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem,parent,false);
        TableViewHolder tableViewHolder = new TableViewHolder(view);
        return tableViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull TableViewHolder tableViewHolder, int i) {
        tableViewHolder.bind(i);
    }
    @Override
    public int getItemCount() {
        return numbersOfItems;
    }
    class TableViewHolder extends RecyclerView.ViewHolder{
        //Обертка для элемента списка raiting
        TextView team1ItemView;
        TextView team2ItemView;
        TextView team1ScoreItemView;
        TextView team2ScoreItemView;
        TextView dateItemView;
        ImageView logo1View;
        ImageView logo2View;
        public TableViewHolder(@NonNull View itemView) {
            super(itemView);
            team1ItemView = itemView.findViewById(R.id.team1id);
            team2ItemView = itemView.findViewById(R.id.team2id);
            team1ScoreItemView = itemView.findViewById(R.id.team1score);
            team2ScoreItemView = itemView.findViewById(R.id.team2score);
            dateItemView =itemView.findViewById(R.id.date);
         logo1View =itemView.findViewById(R.id.team1logo);
//          logo2View = itemView.findViewById(R.id.team2logo);



    }
    void bind(int i){
        Match  m = Matches.matches.get(i);
        team1ItemView.setText(String.valueOf(m.getTeam1()));
        team2ItemView.setText(String.valueOf(m.getTeam2()));
        if (m.getTeam1Score()!=-1){
        team1ScoreItemView.setText(String.valueOf(m.getTeam1Score()));
        team2ScoreItemView.setText(String.valueOf(m.getTeam2Score()));}
        else { team1ScoreItemView.setText(" - ");  team2ScoreItemView.setText(" - ");}
        dateItemView.setText(Matches.matches.get(i).getDate());

        Resources resources =context.getResources();
//        int resourceId = resources.getIdentifier(Objects.requireNonNull(Teams.TeamMap.get(m.getTeam1())).getPathtologo(), "drawable", context.getPackageName());
//        logo1View.setImageResource(resourceId);



    }


    }
    }

