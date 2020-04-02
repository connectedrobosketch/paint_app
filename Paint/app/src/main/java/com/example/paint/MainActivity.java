package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintView paintView;
        paintView = new PaintView( this);
        setContentView(paintView);
    }
}
