package com.congwiny.memoryleak;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setImageResource(R.drawable.exit_browser_moble_safe_night);
        ImageView iv2 = (ImageView) findViewById(R.id.iv2);
        iv2.setColorFilter(getResources().getColor(R.color.color_filter), PorterDuff.Mode.MULTIPLY);
        iv2.setImageResource(R.drawable.exit_browser_moble_safe_day);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        //ListenerCollector.clearListeners();
    }
}
