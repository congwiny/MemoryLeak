package com.congwiny.memoryleak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        MyView myView = new MyView(this);
        setContentView(myView);

    }

    @Override
    protected void onStop() {
        super.onStop();
        //ListenerCollector.clearListeners();
    }
}