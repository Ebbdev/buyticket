package com.ebb.reklamszotobsbileti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,KamilKoc.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,Anadolu.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this,Metro.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this,Pamukkale.class);
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent = new Intent(this,Buzlu.class);
        startActivity(intent);
    }
    public void openActivity7(){
        Intent intent = new Intent(this,Astur.class);
        startActivity(intent);
    }
}
