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
public class A extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);




    }
    public void btnMain(View v)
    {
        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }

    public void btnTimer(View v)
    {
        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        final Dialog dialog = new Dialog(A.this);
        dialog.setContentView(R.layout.dialog_timer_a);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();

        //cierra el dialogo
        dialog.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //cierra el dialogo

    }

    public void btnPrices(View v)
    {
        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        final Dialog dialog = new Dialog(A.this);
        dialog.setContentView(R.layout.dialog_prices);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();

        //cierra el dialogo
        dialog.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //cierra el dialogo
    }

    public void btnShare(final View v)
    {

   /*     Intent email = new Intent(Intent.ACTION_SEND);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        email.putExtra(Intent.EXTRA_EMAIL, "");
        email.putExtra(Intent.EXTRA_SUBJECT, "Mirá esta APP de Subtes");
        email.putExtra(Intent.EXTRA_TEXT, "Hola, esta APP sobre Subtes de Buenos Aires puede serte útil:\n https://play.google.com/store/apps/details?id=com.offline.subte\n\n Saludos");
        email.setType("message/rfc822");
        startActivityForResult(Intent.createChooser(email, getString(R.string.choose_email)), 555);*/

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Subte Off-line Buenos Aires:\n https://goo.gl/05t5cb");
        sendIntent.setType("text/plain");
        //solo whatsapp
        /*sendIntent.setPackage("com.whatsapp");*/
        startActivity(sendIntent);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void btnED(View v)
    {
/*// Native ads --------------------------------------------------------------
        NativeExpressAdView adView = (NativeExpressAdView) findViewById(R.id.adViewDialogED);
        adView.loadAd(new AdRequest.Builder().build());
        setContentView(R.layout.dialog_combinaciones_e_d);
        // end ads -----------------------------------------------------------------*/

        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        final Dialog dialog = new Dialog(A.this);
        dialog.setContentView(R.layout.dialog_combinaciones_e_d);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();


        //cierra el dialogo
        dialog.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //cierra el dialogo

    }

    public void btnE(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), E.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void btnD(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), D.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public void btnC(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), C.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void btnH(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), H.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

}
