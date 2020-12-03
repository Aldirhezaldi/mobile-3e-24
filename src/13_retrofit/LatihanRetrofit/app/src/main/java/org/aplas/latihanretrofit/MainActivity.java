package org.aplas.latihanretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import org.aplas.latihanretrofit.adapter.RepositoryAdapter;
import org.aplas.latihanretrofit.models.Repo;
import org.aplas.latihanretrofit.services.GitHubServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubServices services = retrofit.create(GitHubServices.class);
        TextInputEditText editText = findViewById(R.id.edt_username);
        RepositoryAdapter repositoryAdapter = new RepositoryAdapter();
        RecyclerView recyclerView = findViewById(R.id.rv_repository);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(repositoryAdapter);



        Button btn = findViewById(R.id.btn_search);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Call<List<Repo>> repos = services.listRepos(editText.getText().toString());

                repos.enqueue(new Callback<List<Repo>>() {
                    @Override
                    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> repoList) {

                        if (repoList.isSuccessful()) {
                            if (!repoList.body().isEmpty()) {
                                Log.d("ASDASD", "list tidak kosong");
                            }else {
                                Log.d("ASDASD", "list kosong");
                            }
                            repositoryAdapter.setRepoArrayList(repoList.body());
                        }else {
                            Log.d("ASDASD", "onResponse: " + repoList.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Repo>> call, Throwable t) {
                        Log.e("Error", t.getMessage());
                    }
                });
            }
        });
    }
}