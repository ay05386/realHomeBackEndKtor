package com.example.ali.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main extends AppCompatActivity {
 public void clicl(View view){
     Log.i("info","you just pressed the button");


 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
