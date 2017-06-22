package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by an0o0nym on 21/06/17.
 */

public class NeutralActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_full);

        TextView description = (TextView) findViewById(R.id.description);
        Button songDetails = (Button) findViewById(R.id.button1);
        Button buySong = (Button) findViewById(R.id.button2);

        description.setText(R.string.category_description);

        songDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songDetailsActivity = new Intent(NeutralActivity.this, SongDetailsActivity.class);
                startActivity(songDetailsActivity);
            }
        });

        buySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopActivity = new Intent(NeutralActivity.this, ShopActivity.class);
                startActivity(shopActivity);
            }
        });
    }
}
