package com.example.santikush.moonjackmusicapplication.activitées;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterTrack extends ArrayAdapter{

    private int res;

    public AdapterTrack(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.res= resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AdapterTrack.ViewHolder holder ;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(res,parent,false);
            holder= new AdapterTrack.ViewHolder();
            //holder.nom = convertView.findViewById(R.id.nomClient);
            //holder.prenom = convertView.findViewById(R.id.prenomClient);

            convertView.setTag(holder);
        }else{
            holder = (AdapterTrack.ViewHolder) convertView.getTag();
        }

        /*Client client = getItem(position);
        holder.nom.setText(client.getNom());
        holder.prenom.setText(client.getPrenom());*/

        return convertView;
    }

    static class ViewHolder{
        TextView nom;
        TextView prenom;
    }
}
