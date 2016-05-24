package com.offline.subte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.gms.analytics.Tracker;


public class MainActivity extends AppCompatActivity
{
    private Tracker mTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Obtain the shared Tracker instance.------------------------------------------------------
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        //------------------------------------------------------------------------------------------

    }



    public void btnA(View v)
    {
        Intent intent = new Intent(getApplicationContext(), A.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnB(View v)
    {
        Intent intent = new Intent(getApplicationContext(), B.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnC(View v)
    {
        Intent intent = new Intent(getApplicationContext(), C.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnD(View v)
    {
        Intent intent = new Intent(getApplicationContext(), D.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnE(View v)
    {
        Intent intent = new Intent(getApplicationContext(), E.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnH(View v)
    {
        Intent intent = new Intent(getApplicationContext(), H.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }

    public void btnContact(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Contact.class);
        startActivity(intent);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
    }






}