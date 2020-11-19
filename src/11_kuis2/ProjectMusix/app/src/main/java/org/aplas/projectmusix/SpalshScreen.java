package org.aplas.projectmusix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.os.Bundle;

public class SpalshScreen extends AppCompatActivity {
    private int waktu_loading=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent home=new Intent(SpalshScreen.this, HomePage.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}