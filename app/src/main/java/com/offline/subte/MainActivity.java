package com.offline.subte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnA(View v)
    {
        Intent intent = new Intent(getApplicationContext(), A.class);
        startActivity(intent);
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