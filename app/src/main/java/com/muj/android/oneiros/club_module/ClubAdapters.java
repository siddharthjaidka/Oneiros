package com.muj.android.oneiros.club_module;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.muj.android.oneiros.R;

import java.util.ArrayList;

import static android.graphics.Color.rgb;

/**
 * Created by Shiavngi Pandey on 25-08-2017.
 */

public class ClubAdapters extends RecyclerView.Adapter<ClubAdapters.ClubViewHolder>{

    ArrayList<Events> events;
    Context context;
    public static int counter=0;

    ClubAdapters(ArrayList<Events> events, Context context){
        this.events = events;
        this.context = context;
    }


    @Override
    public ClubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ClubViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ClubViewHolder holder, int position) {

        int ColorCodes[] = {rgb(255,183,77),rgb(255,112,67),rgb(77,182,172),rgb(121,134,203),rgb(240,98,146),rgb(128,222,234),rgb(176,190,197)};
        holder.rr.setBackgroundColor(ColorCodes[counter%7]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,Event_Card_activity.class));
            }
        });
        holder.personName.setText(events.get(position).getName());
        holder.personPhoto.setImageResource(R.drawable.dummy);
        counter++;
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public static class ClubViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView personName,personAge;
        ImageView personPhoto;
        RelativeLayout rr;

        public ClubViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cardViewClubEvents);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
            rr = (RelativeLayout)itemView.findViewById(R.id.CardRelativeLayout);
        }
    }
}
