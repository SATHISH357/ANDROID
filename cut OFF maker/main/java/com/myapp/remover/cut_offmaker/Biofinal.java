package com.myapp.remover.cut_offmaker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by remover on 4/23/2017.
 */
public class Biofinal extends AppCompatActivity {

    TextView et;
    Button b9, b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biofinal_xml);
        final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        Bundle r = getIntent().getExtras();
        et = (TextView) findViewById(R.id.f1);
        b9=(Button)findViewById(R.id.b7);
        b10=(Button)findViewById(R.id.b8);
        String s1=r.getString("ed1");
        String s2=r.getString("ed2");
        String s3=r.getString("ed3");
        float a1=Float.parseFloat(s1);
        float b1=Float.parseFloat(s2);
        float c1=Float.parseFloat(s3);
        float d1=a1/2;
        float e1=b1+c1;
        float f1=e1/4;
        float g1=d1+f1;
        et.setText(g1+" ");
        b9.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),Biomain.class));

            }
        });
        b10.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });


    }

}
