package com.example.tolaotesanya.gesturesfun;

/*
@Tola Otesanya
4th March 2018
Simple app to implement gestures.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private TextView ttext;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttext = (TextView)findViewById(R.id.tmsg);
        this.gestureDetector = new GestureDetectorCompat(this,this); //allow to detect gestures
        gestureDetector.setOnDoubleTapListener(this); //allow double tabs as well
    }

    ///////////// Begin Gestures//////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ttext.setText("onSingleTapConfirmed"); //print out message when gesture is activated
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ttext.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ttext.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ttext.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        ttext.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ttext.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        ttext.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        ttext.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        ttext.setText("onFling");
        return true;
    }

    /////////////End Gestures///////////////

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gestureDetector.onTouchEvent(event); //will check gesture first before activating to onTouch
        return super.onTouchEvent(event);

    } //default event called when user touches the screen
}
