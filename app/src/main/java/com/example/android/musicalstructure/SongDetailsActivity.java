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

public class SongDetailsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details);

        TextView description = (TextView) findViewById(R.id.description);
        Button buySongs = (Button) findViewById(R.id.button3);

        description.setText(R.string.category_description);
        buySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopActivity = new Intent(SongDetailsActivity.this, ShopActivity.class);
                startActivity(shopActivity);
            }
        });

    }
}
