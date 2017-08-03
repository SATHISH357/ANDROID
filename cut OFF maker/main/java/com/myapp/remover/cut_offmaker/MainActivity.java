package com.myapp.remover.cut_offmaker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
   Button b1,b2;
    final Context c=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        b1 = (Button) findViewById(R.id.cs);
        b2 = (Button) findViewById(R.id.b);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                    s.start();
                Intent i = new Intent(c, Csemain.class);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View p) {
                s.start();
                startActivity(new Intent(getApplicationContext(),Biomain.class));
            }
        });
    }
}
