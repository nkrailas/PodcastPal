package com.example.android.podcastpal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the ImageView with the Hidden Brain podcast icon
        ImageView hiddenBrain = findViewById(R.id.hiddenBrainIcon);

        // Set a ClickListener on the Hidden Brain ImageView
        hiddenBrain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hidden Brain podcast icon is clicked on
            @Override
            public void onClick(View view) {
                Intent hiddenBrainIntent = new Intent(MainActivity.this, HiddenBrainActivity.class);
                startActivity(hiddenBrainIntent);
            }
        });

        // Find the ImageView with the WorkLife podcast icon
        ImageView workLife = findViewById(R.id.workLifeIcon);

        // Set a ClickListener on the WorkLife podcast icon
        workLife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the WorkLife podcast icon is clicked on
            @Override
            public void onClick(View view) {
                Intent workLifeIntent = new Intent(MainActivity.this, WorkLifeActivity.class);
                startActivity(workLifeIntent);
            }
        });
    }
}


