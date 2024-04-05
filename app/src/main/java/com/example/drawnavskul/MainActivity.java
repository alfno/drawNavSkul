package com.example.drawnavskul;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.drawnavskul.fragments.guruFragment;
import com.example.drawnavskul.fragments.guruproduktiffragment;
import com.example.drawnavskul.fragments.profilefragment;
import com.example.drawnavskul.fragments.muridfragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showHomePage();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menu_item1) {
                    showHomePage();

                } else if (itemId == R.id.menu_item2) {
                    showMuridPage();
                }
                else if (itemId == R.id.menu_item3) {
                    showGuruProduktifPage();
                }
                else if (itemId == R.id.menu_item4) {
                    showGuruPage();
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new profilefragment())
                .commit();

        getSupportActionBar().setTitle("Home Page");
    }
    private void showGuruPage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new guruFragment())
                .commit();

        getSupportActionBar().setTitle("Guru Page");
    }
    private void showGuruProduktifPage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new guruproduktiffragment())
                .commit();

        getSupportActionBar().setTitle("Guru Produktif Page");
    }
    private void showMuridPage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new muridfragment())
                .commit();

        getSupportActionBar().setTitle("murid Page");
    }

}