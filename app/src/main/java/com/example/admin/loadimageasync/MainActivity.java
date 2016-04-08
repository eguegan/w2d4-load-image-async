package com.example.admin.loadimageasync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.image_container);
    }

    public void loadImage(View v){
        ImageLoader imgLoader = new ImageLoader(this, mImageView);
        imgLoader.execute();
    }
}
