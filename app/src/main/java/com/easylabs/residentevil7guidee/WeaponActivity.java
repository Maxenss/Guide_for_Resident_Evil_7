package com.easylabs.residentevil7guidee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class WeaponActivity extends AppCompatActivity {

    ImageView ivWeapon;
            TextView tvWeaponAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon);

        ivWeapon = (ImageView) findViewById(R.id.ivWeapon);
        tvWeaponAbout = (TextView) findViewById(R.id.tvWeaponAbout);

        if(getIntent().getIntExtra("image", 0) !=0) {
            ivWeapon.setImageResource(getIntent().getIntExtra("image", 0));
        }

        tvWeaponAbout.setText(getString(getIntent().getIntExtra("text", 0)));

        setTitle(getIntent().getStringExtra("label"));
    }
}
