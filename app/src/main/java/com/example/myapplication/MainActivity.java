package com.example.myapplication;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(
                            RadioGroup group,
                            int checkedId) {

                        if (checkedId == R.id.radioApple) {

                            imageView.setImageResource(
                                    R.drawable.apple
                            );

                        } else if (checkedId == R.id.radioBanana) {

                            imageView.setImageResource(
                                    R.drawable.banana
                            );

                        } else if (checkedId == R.id.radioOrange) {

                            imageView.setImageResource(
                                    R.drawable.orange
                            );
                        }
                    }
                });
    }
}