package com.example.zadanie3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Назар on 21.03.2017.
 */

public class Obrazek extends Activity {
    public void zmienObrazek(View v){
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.android2);}
    public void poprzedniObrazek(View v){
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.android);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);

        Button button1 = (Button) findViewById(R.id.button1);

        final Context context;
        context = getApplicationContext();
        final Intent intent = new Intent(context,MainActivity.class);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}
