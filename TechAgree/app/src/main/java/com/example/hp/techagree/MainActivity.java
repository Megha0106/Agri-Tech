package com.example.hp.techagree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread t = new Thread()
        {
            public void run()
            {
               try
               {
                   sleep(4000);
                   Intent i =new Intent(MainActivity.this,Login.class);
                   startActivity(i);
               }
               catch (Exception e)
               {

               }
            }
        };
        t.start();

        textView = (TextView)findViewById(R.id.text);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        textView.setAnimation(animation);



    }


}
