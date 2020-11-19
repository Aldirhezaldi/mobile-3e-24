package org.aplas.projectmusix;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.aplas.projectmusix.databinding.InfoBinding;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomePage()).commit();
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.neg_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            fragment = new HomePage();
                            break;
                        case R.id.nav_music:
                            fragment = new MusicPage();
                            break;
                        case R.id.nav_info:
                            fragment = new InfoPage();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                    return true;

                }
            };
}