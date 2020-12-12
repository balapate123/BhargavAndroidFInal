package com.example.bhargav.marsonia.s301108254;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
/*

  First name: Bhargav
    Last name: Marsonia
    Student Id: 301108254
    Section: 002


*/

public class BhargavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.BhargavTab:
                            selectedFragment = new BhargavTab();
                            break;
                        case R.id.s301108254Tab:
                            selectedFragment = new s301108254Tab();
                            break;
                        case R.id.MarsoniaTab:
                            selectedFragment = new MarsoniaTab();
                            break;
                        case R.id.BhargavMarsoniaTab:
                            selectedFragment = new BhargavMarsoinaTab();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return  true;
                }
            };
}