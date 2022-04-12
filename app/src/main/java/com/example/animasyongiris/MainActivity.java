package com.example.animasyongiris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Animation animasyon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ilk_deneme);
        button.setAnimation(animasyon);

    }
}