package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView tomImageView;
    ImageView jerryImageView;
    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        tomImageView = findViewById(R.id.tomImageView);
        jerryImageView = findViewById(R.id.jerryImageView);

        if (isTomVisible) {
            tomImageView.animate().rotation(3600).alpha(0).scaleX(0).scaleY(0).setDuration(3000);
            jerryImageView.animate().rotation(-3600).alpha(1).scaleX(1).scaleY(1).setDuration(3000);
            isTomVisible = false;
        } else {
            jerryImageView.animate().rotation(3600).alpha(0).scaleX(0).scaleY(0).setDuration(3000);
            tomImageView.animate().rotation(-3600).alpha(1).scaleX(1).scaleY(1).setDuration(3000);
            isTomVisible = true;
        }
    }
}