package com.example.student.synthebeat;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    MyView view;

    int location[] = new int[2];

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new MyView(this);
        setContentView(view);
        view.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(this, "x:"+event.getRawX()+"y:"+event.getRawY(), Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }

    public boolean isTouchInside(View view, int x, int y) {

        final int realRight = location[0] + view.getWidth();
        final int realBottom = location[1] + view.getHeight();
        final boolean result = ((x >= location[0] && x <= realRight) && (y >= location[1] && y <= realBottom));

        return result;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
