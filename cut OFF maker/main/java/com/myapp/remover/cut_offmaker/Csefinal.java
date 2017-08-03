package com.myapp.remover.cut_offmaker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by remover on 4/23/2017.
 */
public class Csefinal extends AppCompatActivity {
    TextView ed4;
    Button b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csefinal_xml);
        final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        Bundle b = getIntent().getExtras();
        ed4 = (TextView) findViewById(R.id.f);
       b3=(Button)findViewById(R.id.bk1);
        b4=(Button)findViewById(R.id.h1);
        String s1=b.getString("ed1");
        String s2=b.getString("ed2");
        String s3=b.getString("ed3");
        float a1=Float.parseFloat(s1);
        float b1=Float.parseFloat(s2);
        float c1=Float.parseFloat(s3);
        float d1=a1/2;
        float e1=b1+c1;
        float f1=e1/4;
        float g1=d1+f1;
        ed4.setText(g1+" ");
        b3.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),Csemain.class));


            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });


    }

}