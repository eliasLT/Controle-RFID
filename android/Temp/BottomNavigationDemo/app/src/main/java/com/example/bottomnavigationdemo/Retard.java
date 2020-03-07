package com.example.bottomnavigationdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Retard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retard);

        //Initialiser et instancier les variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Partie Home
        bottomNavigationView.setSelectedItemId(R.id.recherche);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.recherche:
                        startActivity(new Intent(getApplicationContext()
                                ,Recherche.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.eleve:startActivity(new Intent(getApplicationContext()
                            ,Eleve.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.retard:
                        return true;
                }
                return false;
            }
        });
    }
}
