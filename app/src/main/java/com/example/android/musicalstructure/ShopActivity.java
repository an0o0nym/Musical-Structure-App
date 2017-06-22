package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by an0o0nym on 21/06/17.
 */

public class ShopActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_full);

        TextView description = (TextView) findViewById(R.id.description);
        Button moreDetails = (Button) findViewById(R.id.button1);
        Button buyNow = (Button) findViewById(R.id.button2);

        description.setText(R.string.shop_description);

        moreDetails.setText(R.string.more_details);
        moreDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songDetailsActivity = new Intent(ShopActivity.this, SongDetailsActivity.class);
                startActivity(songDetailsActivity);
            }
        });

        buyNow.setText(R.string.buy_now);
        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.buying_item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
