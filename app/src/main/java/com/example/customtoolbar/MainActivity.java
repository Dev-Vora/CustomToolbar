package com.example.customtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView toolbar_logo1,toolbar_logo2;
    LinearLayout linearLayout;
    private int group1Id = 1;

    int homeId = Menu.FIRST;
    int profileId = Menu.FIRST +1;
    int searchId = Menu.FIRST +2;
    int dealsId = Menu.FIRST +3;
    int helpId = Menu.FIRST +4;
    int contactusId = Menu.FIRST +5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.appbar);
        toolbar_logo1=findViewById(R.id.toolbar_logo1);
        toolbar_logo2=findViewById(R.id.toolbar_logo2);
        linearLayout=findViewById(R.id.linearLayout);
        toolbar.setTitle("DEV");
        setSupportActionBar(toolbar);
        toolbar_logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.BLACK);
                toolbar_logo1.setVisibility(View.GONE);
                toolbar_logo2.setVisibility(View.VISIBLE);
            }
        });
        toolbar_logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.RED);
                toolbar_logo2.setVisibility(View.GONE);
                toolbar_logo1.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(group1Id, homeId, homeId, "Home");
        menu.add(group1Id, profileId, profileId, "Profile");
        menu.add(group1Id, searchId, searchId, "Search");

        return super.onCreateOptionsMenu(menu);
    }
}