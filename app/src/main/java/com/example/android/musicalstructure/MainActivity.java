package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView happy = (TextView) findViewById(R.id.happy);
        TextView neutral = (TextView) findViewById(R.id.neutral);
        TextView sad = (TextView) findViewById(R.id.sad);
        TextView shop = (TextView) findViewById(R.id.shop);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent happyActivity = new Intent(MainActivity.this, HappyActivity.class);
                startActivity(happyActivity);
            }
        });

        neutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neutralActivity = new Intent(MainActivity.this, NeutralActivity.class);
                startActivity(neutralActivity);
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sadActivity = new Intent(MainActivity.this, SadActivity.class);
                startActivity(sadActivity);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopActivity = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(shopActivity);
            }
        });

    }
}
