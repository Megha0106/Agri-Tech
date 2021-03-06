package com.example.hp.techagree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class registration extends AppCompatActivity {
    Spinner spin_district;
    String[]dist = {"Sangli","Satara","Kolhapur","Solapur","Pune","Ahamadnagar","Beed","Aurangabad"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        spin_district = (Spinner)findViewById(R.id.district);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dist);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_district.setAdapter(ad);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration, menu);
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
