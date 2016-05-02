package com.example.terry.androidanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public Button Alpha;
    public Button rotate;
    public Button scale;
    public Button translate;
    public Button bt;
    public Button bt2;
  public   ImageView im;
    public   ImageView Iimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         im = (ImageView) findViewById(R.id.view);
        Alpha = (Button) findViewById(R.id.alpha);
        rotate = (Button) findViewById(R.id.rotate);
        scale = (Button) findViewById(R.id.scale);
        bt = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.next);
        translate = (Button) findViewById(R.id.translate);
        Iimage = (ImageView) findViewById(R.id.imageView);
        Alpha.setOnClickListener(MainActivity.this);
        rotate.setOnClickListener(MainActivity.this);
        scale.setOnClickListener(MainActivity.this);
        translate.setOnClickListener(MainActivity.this);
        bt.setOnClickListener(MainActivity.this);
        bt2.setOnClickListener(MainActivity.this);

    }
    @Override
    public void onClick(View v){
         switch (v.getId())
         {
             case R.id.alpha:
             Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation1);
             im.startAnimation(animation);
             break;
             case R.id.rotate:
                 Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.rotate);
                 im.startAnimation(animation1);
                 break;
             case R.id.translate:
                 Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.translate);
                 im.startAnimation(animation2);
                 break;
             case R.id.scale:
                 Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.scal);
                 im.startAnimation(animation3);
                 break;
             case R.id.button:
              Iimage.setVisibility(View.VISIBLE);
                 AnimationDrawable an = (AnimationDrawable) Iimage.getBackground();
                 an.start();
                 break;
             case R.id.next:
                 //Activity切换动画及ViewGroup动画
                 Intent i = new Intent(this,Main2Activity.class);
                 startActivity(i);
                 //为Activity指定进入和退出动画
                 overridePendingTransition(R.anim.enter_anim,R.anim.exit_anim);
         }
    }
}
