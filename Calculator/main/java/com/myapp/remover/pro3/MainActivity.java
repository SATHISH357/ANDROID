package com.myapp.remover.pro3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
int j=0;
    Button a1, a2, a3, a4, a5, a6, a7, a8, a9, a0, aa, as, am, ad, ac, ae,a10;
    EditText n;
    float m1=0,m2,m3=1,m4,m5=0;
    boolean ma,ms,mm,md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        n=(EditText) findViewById(R.id.n1);
        a1 = (Button) findViewById(R.id.num1);
        a2 = (Button) findViewById(R.id.num2);
        a3 = (Button) findViewById(R.id.num3);
        a4 = (Button) findViewById(R.id.num4);
        a5 = (Button) findViewById(R.id.num5);
        a6 = (Button) findViewById(R.id.num6);
        a7 = (Button) findViewById(R.id.num7);
        a8 = (Button) findViewById(R.id.num8);
        a9 = (Button) findViewById(R.id.num9);
        a0 = (Button) findViewById(R.id.num0);
        aa = (Button) findViewById(R.id.add);
        as = (Button) findViewById(R.id.sub);
        am = (Button) findViewById(R.id.mul);
        ad = (Button) findViewById(R.id.div);
        ac = (Button) findViewById(R.id.clr);
        ae = (Button) findViewById(R.id.eq);
        a10=(Button)findViewById(R.id.num10);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        s.start();
          n.setText(n.getText()+"1");

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"2");

            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"3");

            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"4");

            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"5");

            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"6");

            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"7");

            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText()+"8");

            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n.setText(n.getText()+"9");


            }
        });
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+"0");

            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                n.setText(n.getText()+".");

            }
        });
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                 if(n==null) {
                     n.setText("");
                 }
                else {
                     m1 = m1+Float.parseFloat(n.getText() + "");
                     ma = true;
                     n.setText(null);
                 }
                }

        });
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                j=j+1;
                if(n==null) {
                    n.setText("");
                }
                else {

                    if(j==1){
                    m4 =Float.parseFloat(n.getText() + "");
                    m5=m5-m4;
                    m5=m5*(-1);
                    ms = true;
                    n.setText(null);
                    }
                    else{
                        m4 =Float.parseFloat(n.getText() + "");
                    m5=m5-m4;
                    ms = true;
                    n.setText(null);
                }

            }}
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                if(n==null) {
                    n.setText("");
                }
                else {
                    m3 =m3* Float.parseFloat(n.getText() + "");
                    mm= true;
                    n.setText(null);
                }

            }
        });
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s.start();
                if(n==null) {
                    n.setText("");
                }
                else {
                    m4 =m4+ Float.parseFloat(n.getText() + "");
                    md = true;
                    n.setText(null);
                }

            }
        });
        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s.start();
                if (n== null) {
                    n.setText("enter value");
                }
                else
                {
                    m2 = Float.parseFloat(n.getText() + "");

                    if (ma == true) {

                        n.setText(m1 + m2 + "");
                        ma = false;
                        m1 = 0;
                    }


                    if (ms == true) {

                        n.setText(m5 - m2 + "");
                        ms = false;
                        m5 = 0;
                    }

                    if (mm == true) {

                        n.setText(m3 * m2 + "");
                        mm = false;
                        m3 = 1;
                    }

                    if (md == true) {

                        n.setText(m4 / m2 + "");
                        md = false;
                        m4 = 0;
                    }
                }
            }


        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s.start();
                n.setText("");
         j=0;
            }
        });

    }
}