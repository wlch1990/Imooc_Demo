package com.wlch.zl.imooc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LOG_DEBUG(View view) {
        if (BuildConfig.LOG_DEBUG)
            Log.e("wlch", "显示log");
        else
            Log.e("wlch", "不显示log");
    }
}
