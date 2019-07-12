package com.ufind.shafique.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button about = (Button) findViewById(R.id.abt_alc);
        Button profile = (Button) findViewById(R.id.profile);


        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching About ALC Activity
                Intent i = new Intent(getApplicationContext(), About_Activity.class);
                startActivity(i);

            }
        });

        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching My Profile Activity
                Intent i = new Intent(getApplicationContext(), Profile_Activity.class);
                startActivity(i);

            }
        });
    }
}
