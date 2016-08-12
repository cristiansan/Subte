package com.offline.subte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * Created by Cnc on 13/04/2016.
 */
public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);

        ImageView starImageView = (ImageView) findViewById(R.id.mapa);

        starImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ScaleAnimation starScaleAnimation =
                        new ScaleAnimation(1f, 1f, 1f, 1f,
                                ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                                ScaleAnimation.RELATIVE_TO_SELF, 0.5f);

                starScaleAnimation.setDuration(500);
                ((ImageView) v).setImageResource(R.drawable.mapa);
                ScaleAnimation scaleAnim = starScaleAnimation;
                v.startAnimation(scaleAnim);
            }
        });
    }

    public void btnMain(View v)
    {
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        v.startAnimation(blink);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
