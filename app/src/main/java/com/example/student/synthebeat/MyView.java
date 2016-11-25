package com.example.student.synthebeat;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by student on 2016-11-25.
 */

public class MyView extends View {
    Context context;
    String TAG = this.getClass().getName();

    int x;
    int y;

    public MyView(Context context) {
        super(context);
        this.context = context;
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d(TAG, "터치");
            x = (int) event.getRawX();
            y = (int) event.getRawY();


            Toast.makeText(context, "x:" + event.getX() + "y:" + event.getY(), Toast.LENGTH_SHORT).show();
        }

        return super.onTouchEvent(event);
    }
}
