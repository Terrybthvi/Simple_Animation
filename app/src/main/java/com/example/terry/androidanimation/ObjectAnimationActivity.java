package com.example.terry.androidanimation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ObjectAnimationActivity extends AppCompatActivity {
public ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);
    }
    public void rotateyAnimRun(View view)
    {
             ObjectAnimator//
              .ofFloat(view, "rotationX", 0.0F, 360.0F)//
              .setDuration(500)//
               .start();
           }

}
