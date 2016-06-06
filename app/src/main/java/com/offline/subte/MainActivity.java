package com.offline.subte;

import android.content.Intent;
import android.os.Build;
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
        overridePendingTransition(R.anim.fadein, R.anim.slide);
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

    public void btnContactUs(final View v)
    {
        String contenido_email = "";
        contenido_email += "\n" + "OS version: "+ Build.VERSION.RELEASE;
        contenido_email += "\n" + "Display: "+ Build.DISPLAY;
        contenido_email += "\n" + "Brand: " + Build.BRAND;
        contenido_email += "\n" + "Manufacturer: " + Build.MANUFACTURER;
        contenido_email += "\n" + "Model: " + Build.MODEL;
        contenido_email += "\n" + "(Esta información es útil para nosotros)";

        contenido_email += "\n\n\n" + "Escribe tu mensaje acá: ";

        Intent email = new Intent(Intent.ACTION_SEND);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.contact_email)});
        email.putExtra(Intent.EXTRA_SUBJECT, "Sugerencia");
        email.putExtra(Intent.EXTRA_TEXT, contenido_email);
        email.setType("message/rfc822");
        startActivityForResult(Intent.createChooser(email, getString(R.string.choose_email)), 555);
    }




}