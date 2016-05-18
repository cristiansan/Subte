package com.offline.subte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        /*overridePendingTransition(R.anim.fade_in, R.anim.slide_right);*/
    }

    public void btnB(View v)
    {
        Intent intent = new Intent(getApplicationContext(), B.class);
        startActivity(intent);
    }

    public void btnC(View v)
    {
        Intent intent = new Intent(getApplicationContext(), C.class);
        startActivity(intent);
    }

    public void btnD(View v)
    {
        Intent intent = new Intent(getApplicationContext(), D.class);
        startActivity(intent);
    }

    public void btnE(View v)
    {
        Intent intent = new Intent(getApplicationContext(), E.class);
        startActivity(intent);
    }

    public void btnH(View v)
    {
        Intent intent = new Intent(getApplicationContext(), H.class);
        startActivity(intent);
    }

    public void btnContact(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Contact.class);
        startActivity(intent);
    }






}