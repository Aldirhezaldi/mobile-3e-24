package org.aplas.projectmusix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAlbumAdapter extends RecyclerView.Adapter<MyAlbumAdapter.ViewHolder>{

    MyAlbumData[] myAlbumData;

    public MyAlbumAdapter(MyAlbumData[] myAlbumData) {
        this.myAlbumData = myAlbumData;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_album, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        MyAlbumData myAlbumDataList = myAlbumData[position];
        holder.textViewName.setText(myAlbumDataList.getAlbumName());
        holder.textViewDate.setText(myAlbumDataList.getAlbumDate());
        holder.textViewBand.setText(myAlbumDataList.getAlbumBand());
        holder.albumImage.setImageResource(myAlbumDataList.getAlbumImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), myAlbumDataList.getAlbumName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myAlbumData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView albumImage;
        TextView textViewName;
        TextView textViewDate;
        TextView textViewBand;

        public ViewHolder( View itemView) {
            super(itemView);
            albumImage = itemView.findViewById(R.id.rv_image_album);
            textViewName = itemView.findViewById(R.id.albumName);
            textViewBand = itemView.findViewById(R.id.albumBand);
            textViewDate = itemView.findViewById(R.id.albumdate);
        }
    }
}
