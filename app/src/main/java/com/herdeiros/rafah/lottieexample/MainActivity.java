package com.herdeiros.rafah.lottieexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottie;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottie = findViewById(R.id.animation);
        button = findViewById(R.id.button);
        button.setText("Pause");

    }

    public void animate(View v) {
        if (lottie.isAnimating()){ //se a animação estiver rolando
            lottie.cancelAnimation();
            button.setText("Start");
        } else {
            lottie.playAnimation();
            button.setText("Pause");
        }
    }
}
