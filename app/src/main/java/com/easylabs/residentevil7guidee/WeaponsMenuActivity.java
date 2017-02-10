package com.easylabs.residentevil7guidee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class WeaponsMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btAxe;
    Button btKnife1;
    Button btKnife2;
    Button btM19;
    Button btG17;
    Button btMPM;
    Button btMAG;
    Button btAlbert;
    Button btM37;
    Button btM21;
    Button btP19;
    Button btFlamer;
    Button btLauncher;
    Button btCircularSaw;
    Button btChainsaw;

    Intent intent;

    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_menu);

        setTitle("Оружие");

        btAxe = (Button) findViewById(R.id.btAxe);
        btKnife1 = (Button) findViewById(R.id.btKnife1);
        btKnife2 = (Button) findViewById(R.id.btKnife2);
        btCircularSaw = (Button) findViewById(R.id.btCircularSaw);
        btChainsaw = (Button) findViewById(R.id.btChainsaw);
        btM19 = (Button) findViewById(R.id.btM19);
        btG17 = (Button) findViewById(R.id.btG17);
        btMPM = (Button) findViewById(R.id.btMPM);
        btMAG = (Button) findViewById(R.id.btMAG);
        btAlbert = (Button) findViewById(R.id.btAlbert);
        btM37 = (Button) findViewById(R.id.btM37);
        btM21 = (Button) findViewById(R.id.btM21);
        btP19 = (Button) findViewById(R.id.btP19);
        btFlamer = (Button) findViewById(R.id.btFlamer);
        btLauncher = (Button) findViewById(R.id.btLauncher);

        btAxe.setOnClickListener(this);
        btKnife1.setOnClickListener(this);
        btKnife2.setOnClickListener(this);
        btCircularSaw.setOnClickListener(this);
        btChainsaw.setOnClickListener(this);
        btM19.setOnClickListener(this);
        btG17.setOnClickListener(this);
        btMPM.setOnClickListener(this);
        btMAG.setOnClickListener(this);
        btAlbert.setOnClickListener(this);
        btM37.setOnClickListener(this);
        btM21.setOnClickListener(this);
        btP19.setOnClickListener(this);
        btFlamer.setOnClickListener(this);
        btLauncher.setOnClickListener(this);

        animation = AnimationUtils.loadAnimation(this, R.anim.butanim);
    }

    @Override
    public void onClick(View v) {
        v.startAnimation(animation);

        switch (v.getId()) {
            case R.id.btAxe:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("text", R.string.axe_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btKnife1:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("text", R.string.knife1_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btKnife2:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("text", R.string.knife2_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btCircularSaw:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("text", R.string.circular_saw_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btChainsaw:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("text", R.string.chainsaw_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btM19:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.m19);
                intent.putExtra("text", R.string.m19_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btG17:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.g17);
                intent.putExtra("text", R.string.g17_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btMPM:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.mpm);
                intent.putExtra("text", R.string.mpm_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btMAG:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.mag);
                intent.putExtra("text", R.string.mag_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btAlbert:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.albert);
                intent.putExtra("text", R.string.albert_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btM37:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.m37);
                intent.putExtra("text", R.string.m37_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btM21:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.m21);
                intent.putExtra("text", R.string.m21_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btP19:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.p19);
                intent.putExtra("text", R.string.p19_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btFlamer:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.flamer);
                intent.putExtra("text", R.string.flamer_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
            case R.id.btLauncher:
                intent = new Intent(this, WeaponActivity.class);
                intent.putExtra("image", R.drawable.launcher);
                intent.putExtra("text", R.string.launcher_text);
                intent.putExtra("label", ((Button) v).getText().toString());
                startActivity(intent);
                break;
        }
    }
}
