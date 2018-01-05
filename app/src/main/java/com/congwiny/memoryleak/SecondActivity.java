package com.congwiny.memoryleak;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView1 = (ImageView) findViewById(R.id.iv1);
        imageView1.setImageResource(R.drawable.xinkaiti_theme);

        ImageView imageView2 = (ImageView) findViewById(R.id.iv2);
        Drawable drawable = DrawableUtil.colorDrawable(getResources(),R.drawable.xinkaiti,R.color.color_filter4,PorterDuff.Mode.SRC_IN);
        imageView2.setImageDrawable(drawable);
    }
}
