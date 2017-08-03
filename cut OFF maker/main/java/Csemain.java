import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import com.myapp.remover.cut_offmaker.Csefinal;
import com.myapp.remover.cut_offmaker.MainActivity;
import com.myapp.remover.cut_offmaker.R;

/**
 * Created by remover on 4/23/2017.
 */
public class Csemain extends AppCompatActivity {


    Button b1, b2;
    EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csemain_xml);
        final MediaPlayer s;
        s = MediaPlayer.create(this, R.raw.ps);
        b1 = (Button) findViewById(R.id.sh);
        b2 = (Button) findViewById(R.id.bk);
        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        ed3=(EditText)findViewById(R.id.e3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                s.start();
                startActivity(new Intent(getApplicationContext(),Csefinal.class));

            }
        });
    }
}