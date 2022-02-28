package com.example.hp.techagree;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Summer extends AppCompatActivity {
    ListView listView;
    String [] str = {"कलिंगड","काकडी","दोडका","घोसाळी","कारली","दुधीभोपळा","तोंडली","भेंडी"};
    int [] img = {R.drawable.watermelon,R.drawable.cucumber,R.drawable.anledluffa,R.drawable.ghosali,R.drawable.bitterguard,R.drawable.luffa,R.drawable.tendli,R.drawable.ladyfinger};
    ImageButton call,whatsapp;
    Button summer_market;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);
        listView = (ListView)findViewById(R.id.summer_list);
        CustomeAdapter cd = new CustomeAdapter(this,str,img);
        listView.setAdapter(cd);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Summer.this,Watermelon.class);
                    startActivity(i);
                }
                if (position == 1) {
                    Intent i = new Intent(Summer.this,Kakadi.class);
                    startActivity(i);
                }
                if (position == 2)
                {
                    Intent i =new Intent(Summer.this,Dodka.class);
                    startActivity(i);
                }
                if (position == 3)
                {
                    Intent i = new Intent(Summer.this,Ghosali.class);
                    startActivity(i);
                }
                if (position == 4)
                {
                    Intent i = new Intent(Summer.this,Karli.class);
                    startActivity(i);
                }
                if (position == 5)
                {
                    Intent i = new Intent(Summer.this,Dudhibhopla.class);
                    startActivity(i);
                }
                if(position == 6)
                {
                    Intent i = new Intent(Summer.this,Tendali.class);
                    startActivity(i);
                }
                if (position == 7)
                {
                    Intent i = new Intent(Summer.this,Bhendi.class);
                    startActivity(i);
                }
            }
        });

        call = (ImageButton)findViewById(R.id.summer_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:9689716789"));
                startActivity(i);
            }
        });

        whatsapp = (ImageButton)findViewById(R.id.summer_whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String uri = "https://chat.whatsapp.com";
                i.setData(Uri.parse(uri));
                startActivity(i);
            }
        });

        summer_market = (Button)findViewById(R.id.summer_market);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Shivaji01.ttf");
        summer_market.setTypeface(typeface);
        summer_market.setText("बाजारभाव");

        summer_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.puneapmc.org/rates.aspx");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });


    }


}
