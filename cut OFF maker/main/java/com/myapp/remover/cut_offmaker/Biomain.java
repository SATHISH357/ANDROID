package com.myapp.remover.cut_offmaker;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by remover on 4/23/2017.
 */
public class Biomain extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2, ed3;
    final Context l=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biomain_xml);
        final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        b1 = (Button) findViewById(R.id.b6);
        b2 = (Button) findViewById(R.id.b5);
        ed1 = (EditText) findViewById(R.id.e4);
        ed2 = (EditText) findViewById(R.id.e5);
        ed3 = (EditText) findViewById(R.id.e6);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                s.start();
                Intent i = new Intent(l, Biofinal.class);

                Bundle b = new Bundle();
                b.putString("ed1", ed1.getText().toString());
                b.putString("ed2", ed2.getText().toString());
                b.putString("ed3", ed3.getText().toString());
                i.putExtras(b);
                startActivity(i);
            }
        });
    }



}