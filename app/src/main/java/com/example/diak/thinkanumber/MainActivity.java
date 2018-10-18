package com.example.diak.thinkanumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView Image_View_h1, Image_View_h2, Image_View_h3, Image_View_h4, Image_View_h5;
    private Button Button_plus, Button_minus, Button_kuld;
    private TextView Text_View_szam;
    private int szam = 0;
    private int random = 0;
    private int elet = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        Button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(szam == 0)) {
                    szam--;
                    Text_View_szam.setText("" + szam);
                }
                else{
                    Toast.makeText(MainActivity.this, "Ez a minimum!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(szam == 10)) {
                    szam++;
                    Text_View_szam.setText("" + szam);
                }
                else{
                    Toast.makeText(MainActivity.this, "Ez a maximum!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button_kuld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (szam == random && elet >= 1) {

                    Button_kuld.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Eltaláltad a számot, maradt " + elet + " életed!", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if (szam < random)
                    {
                        if (elet == 5) Image_View_h1.setBackgroundResource(R.drawable.heart1);
                        if (elet == 4) Image_View_h2.setBackgroundResource(R.drawable.heart1);
                        if (elet == 3) Image_View_h3.setBackgroundResource(R.drawable.heart1);
                        if (elet == 2) Image_View_h4.setBackgroundResource(R.drawable.heart1);
                        if (elet == 1) Image_View_h5.setBackgroundResource(R.drawable.heart1);
                        elet--;
                        Toast.makeText(MainActivity.this, "Felfelé", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if (elet == 5) Image_View_h1.setBackgroundResource(R.drawable.heart1);
                        if (elet == 4) Image_View_h2.setBackgroundResource(R.drawable.heart1);
                        if (elet == 3) Image_View_h3.setBackgroundResource(R.drawable.heart1);
                        if (elet == 2) Image_View_h4.setBackgroundResource(R.drawable.heart1);
                        if (elet == 1) Image_View_h5.setBackgroundResource(R.drawable.heart1);
                        elet--;
                        Toast.makeText(MainActivity.this, "Lefelé", Toast.LENGTH_SHORT).show();
                    }

                }

                if (elet == 0)
                {
                    Toast.makeText(MainActivity.this, "Vége a játéknak, sajnos nem találtad el a kigondolt számot! :(", Toast.LENGTH_SHORT).show();
                    finish();

                }

            }
        });

    }

    public void init()
    {
        Image_View_h1 = (ImageView) findViewById(R.id.Image_View_h1);
        Image_View_h2 = (ImageView) findViewById(R.id.Image_View_h2);
        Image_View_h3 = (ImageView) findViewById(R.id.Image_View_h3);
        Image_View_h4 = (ImageView) findViewById(R.id.Image_View_h4);
        Image_View_h5 = (ImageView) findViewById(R.id.Image_View_h5);
        Button_plus = (Button) findViewById(R.id.Button_plus);
        Button_minus = (Button) findViewById(R.id.Button_minus);
        Button_kuld = (Button) findViewById(R.id.Button_kuld);
        Text_View_szam = (TextView) findViewById(R.id.Text_View_szam);

        Random r = new Random();
        random = r.nextInt(10) + 1;

    }

}
