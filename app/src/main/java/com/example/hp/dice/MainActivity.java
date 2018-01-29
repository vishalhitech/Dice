package com.example.hp.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftImage = (ImageView) findViewById(R.id.left_image);

        final ImageView rightImage = (ImageView) findViewById(R.id.right_image);

        final int[] diceimages =
                {       R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6
                };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rndGenrator = new Random();

                int number = rndGenrator.nextInt(6);
                Log.d("Dice","The Random No. is " + number);

                leftImage.setImageResource(diceimages[number]);

                number = rndGenrator.nextInt(6);
                Log.d("Dice","The Random No. is " + number);

                rightImage.setImageResource(diceimages[number]);
            }
        });


    }
}