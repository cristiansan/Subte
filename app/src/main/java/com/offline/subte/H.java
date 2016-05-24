package com.offline.subte;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by Cnc on 13/04/2016.
 */
public class H extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h);
    }
    public void btnMain(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void btnTimer(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Dialog dialog = new Dialog(H.this);
        dialog.setContentView(R.layout.dialog_timer_h);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();

    }
    public void btnShare(final View v)
    {

        Intent email = new Intent(Intent.ACTION_SEND);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        email.putExtra(Intent.EXTRA_EMAIL, "");
        email.putExtra(Intent.EXTRA_SUBJECT, "Mirá esta APP de Subtes");
        email.putExtra(Intent.EXTRA_TEXT, "Hola, esta APP sobre Subtes de Buenos Aires puede serte útil:\n https://play.google.com/store/apps/details?id=com.offline.subte\n\n Saludos");
        email.setType("message/rfc822");
        startActivityForResult(Intent.createChooser(email, getString(R.string.choose_email)), 555);
    }
}
