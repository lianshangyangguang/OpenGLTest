package com.gwell.view.opengltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Myglsurfaceview view = new Myglsurfaceview(this);
//        setContentView(R.layout.activity_main);
        setContentView(view);
    }

}
