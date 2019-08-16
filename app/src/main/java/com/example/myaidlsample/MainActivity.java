package com.example.myaidlsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.library.listener.NetWorkObserver;
import com.example.library.type.NetType;

public class MainActivity extends AppCompatActivity implements NetWorkObserver {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConnect(NetType netType) {

    }

    @Override
    public void onDisConnect() {

    }
}
