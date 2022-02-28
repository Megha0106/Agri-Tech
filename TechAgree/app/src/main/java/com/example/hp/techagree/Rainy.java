package com.example.hp.techagree;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Rainy extends AppCompatActivity {

    ImageButton call,whatsapp;
    ListView lv;
    String[] str = {"कापूस","मका","ज्वारी","तांदूळ","तूर","भुईमूग","उडीद","सोयाबीन","चवळी"};
    int [] images = {R.drawable.cotton,R.drawable.maize,R.drawable.sorghum,R.drawable.rice,R.drawable.pigeonpea,R.drawable.groundnut,R.drawable.blackgram,R.drawable.bean,R.drawable.cowpea};
    Button rainy_market;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainy);
        call = (ImageButton)findViewById(R.id.rainy_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel: 9689716789"));
                startActivity(i);
            }
        });

        whatsapp = (ImageButton)findViewById(R.id.rainy_whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                String uri = "https://chat.whatsapp.com";
                i.setData(Uri.parse(uri));

                startActivity(i);
            }
        });

        lv = (ListView)findViewById(R.id.rainy_list);
        CustomeAdapter cd = new CustomeAdapter(this,str,images);
        lv.setAdapter(cd);

        rainy_market = (Button)findViewById(R.id.rainy_market);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Shivaji01.ttf");
        rainy_market.setTypeface(typeface);
        rainy_market.setText("बाजारभाव");

        rainy_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.puneapmc.org/rates.aspx");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0)
                {
                    Intent i = new Intent(Rainy.this,Kapus.class);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rainy, menu);
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
