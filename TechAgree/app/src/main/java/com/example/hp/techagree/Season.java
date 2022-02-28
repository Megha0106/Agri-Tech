package com.example.hp.techagree;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Season extends AppCompatActivity {

    Button summer,rainy,winter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        summer = (Button)findViewById(R.id.summer);
        rainy = (Button)findViewById(R.id.rainy);
        winter = (Button)findViewById(R.id.winter);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"Shivaji01.ttf");
        summer.setTypeface(typeface);
        rainy.setTypeface(typeface);
        winter.setTypeface(typeface);

        summer.setText("उन्हाळा");
        rainy.setText("पावसाळा");
        winter.setText("हिवाळा");

        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Season.this,Summer.class);
                startActivity(i);
            }
        });


        rainy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Season.this,Rainy.class);
                startActivity(i);
            }
        });


        winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Season.this,Winter.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_season, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
