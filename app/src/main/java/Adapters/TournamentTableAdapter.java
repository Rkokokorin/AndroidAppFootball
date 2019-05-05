package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fotballap.Logic.domain.teams.Team;
import com.example.fotballap.Logic.domain.teams.Teams;
import com.example.fotballap.R;

import java.util.Collections;
import java.util.Comparator;


public class TournamentTableAdapter extends RecyclerView.Adapter<TournamentTableAdapter.TableViewHolder>{
    private int numbersOfItems;
    public TournamentTableAdapter(int numbersOfItems){
        this.numbersOfItems=numbersOfItems;
    }
    @NonNull
    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Context context =parent.getContext();
        int layoutIdForListItem=R.layout.table_element;
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
        TextView numberTableItemView;
        TextView nameTableItemView;
        TextView winsTableItemView;
        TextView drawsTableItemView;
        TextView pointsTableItemView;
        TextView losesTableItemView;
        TextView gamesTableItemView;
        public TableViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTableItemView =itemView.findViewById(R.id.table_name_id);
            numberTableItemView =itemView.findViewById(R.id.table_pos_id);
            winsTableItemView=itemView.findViewById(R.id.table_wins_id);
            losesTableItemView =itemView.findViewById(R.id.table_loses_id);
            drawsTableItemView=itemView.findViewById(R.id.table_draws_id);
            gamesTableItemView =itemView.findViewById(R.id.table_games_id);
            pointsTableItemView = itemView.findViewById(R.id.table_points_id);


    }
    void bind(int i){
        Collections.sort(Teams.sortedTeams, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
               if (o1.getPoints() == o2.getPoints())
                 return o2.getGoals()-o2.getInGoals()-o1.getGoals()+o1.getInGoals();
else return o2.getPoints()-o1.getPoints();
            }
        });


            numberTableItemView.setText(String.valueOf(i+1));
          nameTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getName()));
          winsTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getWins()));
        losesTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getLoses()));
        drawsTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getDraws()));
        gamesTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getGames()));
        pointsTableItemView.setText(String.valueOf(Teams.sortedTeams.get(i).getPoints()));


    }


    }
    }

