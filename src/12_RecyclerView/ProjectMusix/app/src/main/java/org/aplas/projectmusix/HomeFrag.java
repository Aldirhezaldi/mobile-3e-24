package org.aplas.projectmusix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        MyAlbumData[] myAlbumData = new MyAlbumData[]{
                new MyAlbumData("Sempiternal","1 April 2013",R.drawable.sempiternal,"Bring Me The Horizon"),
                new MyAlbumData("Amo","25 Januari 2019",R.drawable.amo,"Bring Me The Horizon"),
                new MyAlbumData("Flying Solo","14 Juni 20193",R.drawable.flyingsolo,"Pamungkas"),
                new MyAlbumData("Minutes to Midnight","14 Mei 2007",R.drawable.mtom,"Linkin Park"),
                new MyAlbumData("Handwritten","14 April 2015",R.drawable.handwritten,"Shawn Mendes"),
        };

        MyAlbumAdapter myAlbumAdapter = new MyAlbumAdapter(myAlbumData);
        recyclerView.setAdapter(myAlbumAdapter);
    }
}
