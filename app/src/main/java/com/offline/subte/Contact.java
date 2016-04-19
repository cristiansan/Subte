package com.offline.subte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cnc on 13/04/2016.
 */
public class Contact extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }

    public void btnContactUs(final View v)
    {


        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.contact_email)});
        email.putExtra(Intent.EXTRA_SUBJECT, "Sugerencia");
        email.putExtra(Intent.EXTRA_TEXT, "Escribe tu mensaje acá");
        email.setType("message/rfc822");
        startActivityForResult(Intent.createChooser(email, "Choose an Email client :"), 555);
    }
}
