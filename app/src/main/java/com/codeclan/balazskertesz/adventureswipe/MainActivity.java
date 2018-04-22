package com.codeclan.balazskertesz.adventureswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Game game;
    OnSwipeTouchListener touchSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
        touchSwipe = new OnSwipeTouchListener(MainActivity.this);
        System.out.println("Program started running!");
    }

    public boolean onTouch(View v,MotionEvent event){
        touchSwipe.onTouch(v,event);
        return false;
    }


}
