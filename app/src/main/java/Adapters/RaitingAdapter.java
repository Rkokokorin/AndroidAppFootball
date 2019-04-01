package Adapters;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fotballap.Logic.Raiting;
import com.example.fotballap.Logic.domain.persons.Person;
import com.example.fotballap.Logic.domain.persons.Persons;
import com.example.fotballap.R;

import static com.example.fotballap.Logic.Raiting.*;

public class RaitingAdapter extends RecyclerView.Adapter<RaitingAdapter.RaitingViewHolder>{
    private int numbersOfItems;
    public RaitingAdapter(int numbersOfItems){
        this.numbersOfItems=numbersOfItems;
    }
    @NonNull
    @Override
    public RaitingViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Context context =parent.getContext();
        int layoutIdForListItem=R.layout.raitingelementlayout;
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem,parent,false);
        RaitingViewHolder raitingViewHolder = new RaitingViewHolder(view);
        return raitingViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull RaitingViewHolder raitingViewHolder, int i) {
        raitingViewHolder.bind(i);
    }
    @Override
    public int getItemCount() {
        return numbersOfItems;
    }
    class RaitingViewHolder extends RecyclerView.ViewHolder{
        //Обертка для элемента списка raiting
        TextView numberRaitingItemView;
        TextView nameRaitingItemView;
        TextView goalsRaitingItemView;
        TextView assistsRaitingItemView;
        public RaitingViewHolder(@NonNull View itemView) {
            super(itemView);
            nameRaitingItemView =itemView.findViewById(R.id.raiting_name_id);
            numberRaitingItemView =itemView.findViewById(R.id.raiting_pos_id);
            goalsRaitingItemView=itemView.findViewById(R.id.raiting_goals_id);
            assistsRaitingItemView=itemView.findViewById(R.id.raiting_assists_id);

    }
    void bind(int i){


            i++;
            numberRaitingItemView.setText(String.valueOf(i));
          nameRaitingItemView.setText(String.valueOf(Persons.Players.get(i-1).getName()));
            goalsRaitingItemView.setText(String.valueOf(Persons.Players.get(i-1).getGoals()));
       assistsRaitingItemView.setText(String.valueOf(Persons.Players.get(i-1).getAssists()));


    }


    }
    }

