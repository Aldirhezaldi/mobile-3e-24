package org.aplas.latihanretrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.aplas.latihanretrofit.R;
import org.aplas.latihanretrofit.models.Repo;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.ViewHolder> {
    private ArrayList<Repo> repoArrayList = new ArrayList<>();

    public void setRepoArrayList(List<Repo> list){
        this.repoArrayList.clear();
        this.repoArrayList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_repository, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(repoArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return repoArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvrepository_name;
        TextView tvrepository_url;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvrepository_name = itemView.findViewById(R.id.tv_repository_name);
            tvrepository_url = itemView.findViewById(R.id.tv_repository_url);
        }
        public void bind (Repo repo){
            tvrepository_name.setText(String.valueOf(repo.getId()));
            tvrepository_url.setText(repo.getHtmlUrl());
        }
    }
}
