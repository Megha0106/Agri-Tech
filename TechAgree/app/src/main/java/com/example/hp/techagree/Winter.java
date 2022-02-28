package com.example.hp.techagree;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Winter extends AppCompatActivity {

    ListView lv;
    ImageButton call,whatsapp;
    Button winter_market;

    String [] str = {"बटाटा","वाटाणे","पालक","कोबी","मोहरी","सूर्यफूल","कोथिंबीर","जिरे"};
    int [] images = {R.drawable.potato,R.drawable.greenpeas,R.drawable.spinach,R.drawable.cabbage,R.drawable.mustard,R.drawable.sunflower,R.drawable.coriander,R.drawable.cumin};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);

        call = (ImageButton)findViewById(R.id.winter_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel: 9689716789"));
                startActivity(i);
            }
        });

        whatsapp = (ImageButton)findViewById(R.id.winter_whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String uri = "https://chat.whatsapp.com";
                i.setData(Uri.parse(uri));
                startActivity(i);
            }
        });

        lv = (ListView)findViewById(R.id.winter_list);
        CustomeAdapter cd = new CustomeAdapter(this,str,images);
        lv.setAdapter(cd);

        winter_market = (Button)findViewById(R.id.winter_market);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Shivaji01.ttf");
        winter_market.setTypeface(typeface);
        winter_market.setText("बाजारभाव");

        winter_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.puneapmc.org/rates.aspx");
                Intent i =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_winter, menu);
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
