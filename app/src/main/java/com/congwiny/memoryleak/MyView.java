package com.congwiny.memoryleak;

import android.content.Context;
import android.view.View;


public class MyView extends View{
    public  MyView(Context context){
        super(context);
        init();
    }

    public interface MyListener{
        public void myListenerCallback();
    }

    private void init(){
        ListenerCollector collector = new ListenerCollector();
        collector.setsListener(this,myListener);
    }

    private MyListener myListener = new MyListener() {
        @Override
        public void myListenerCallback() {
            System.out.print("有被调用");
        }
    };

}
