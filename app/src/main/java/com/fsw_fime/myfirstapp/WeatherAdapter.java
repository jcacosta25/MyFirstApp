package com.fsw_fime.myfirstapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Juan C. Acosta on 4/30/2016.
 * bbxmstudios
 * juan.acosta@bbxmstudios.com
 */
public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.MyViewHolder>{

    private List<Clima> climaList;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView temp,ciudad;

        public MyViewHolder(View v){
            super(v);
            temp = (TextView) v.findViewById(R.id.txt_temp);
            ciudad = (TextView) v.findViewById(R.id.txt_city);
        }


    }

    public WeatherAdapter(List<Clima> climaList){
        this.climaList = climaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.clima_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Clima clima = climaList.get(position);
        holder.ciudad.setText(clima.getCiudad());
        holder.temp.setText(clima.getTemp());
    }

    @Override
    public int getItemCount() {
        return climaList.size();
    }




}
