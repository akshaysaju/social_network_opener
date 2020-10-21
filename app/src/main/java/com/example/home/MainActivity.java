package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.yt);
        b2=findViewById(R.id.twtr);
        b3=findViewById(R.id.tlgrm);
        b4=findViewById(R.id.chrm);
        b5=findViewById(R.id.wtsp);
        b6=findViewById(R.id.insta);
        b7=findViewById(R.id.zoom);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("org.telegram.messenger");
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.android.chrome");
                startActivity(i);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(i);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("us.zoom.videomeetings");
                startActivity(i);

            }
        });


    }
}