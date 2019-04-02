package com.ducle.displayphoto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupPhoto;
    ImageView imageViewPhoto;
    Integer[]photos = {R.drawable.elephant,R.drawable.sheep, R.drawable.turtle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupPhoto = (RadioGroup)findViewById(R.id.RadioGroupPhoto);
        imageViewPhoto = (ImageView)findViewById(R.id.imageViewPhoto);
        radioGroupPhoto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) radioGroupPhoto.findViewById(checkedId);
                int index = group.indexOfChild(radioButton);
                imageViewPhoto.setImageResource(photos[index]);

            }
        });
    }
}
