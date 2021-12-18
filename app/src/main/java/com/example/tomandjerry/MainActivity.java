package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView tomImageView;
    ImageView jerryImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        tomImageView = findViewById(R.id.tomImageView);
        jerryImageView = findViewById(R.id.jerryImageView);

        if (tomImageView.getAlpha() == 1) {
            tomImageView.animate().alpha(0).setDuration(3000);
            jerryImageView.animate().alpha(1).setDuration(3000);
        } else {
            jerryImageView.animate().alpha(0).setDuration(3000);
            tomImageView.animate().alpha(1).setDuration(3000);
        }
    }
}