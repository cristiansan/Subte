package com.offline.subte;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

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
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void btnTimer(View v)
    {
       Dialog dialog = new Dialog(A.this);
        dialog.setContentView(R.layout.dialog_timer_a);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();


    }



}
