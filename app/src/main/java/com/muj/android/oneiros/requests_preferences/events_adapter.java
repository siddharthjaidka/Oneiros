package com.muj.android.oneiros.requests_preferences;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.muj.android.oneiros.R;

import java.util.List;


/**
 * Created by aesher on 8/27/2017.
 */

public class events_adapter  extends RecyclerView.Adapter<events_adapter.MyViewHolder>{


    private Context myContext;
    private List <event_provider> myProvider;

    public events_adapter(Context mContext, List<event_provider> mProvider){
        this.myContext= mContext;
        this.myProvider = mProvider;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        event_provider pro= myProvider.get(position);
        Glide.with(myContext).load(pro.getMyIMAGE()).fitCenter().into(holder.IMAGE);

    }

    @Override
    public int getItemCount() {
        return myProvider.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        ImageView IMAGE;


        MyViewHolder(View itemView) {
            super(itemView);
            IMAGE = (ImageView) itemView.findViewById(R.id.circle);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
