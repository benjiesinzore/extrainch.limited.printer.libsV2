package com.sinzore.printerversiontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sinzore.printertwo.PrintActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintActivity pp = new PrintActivity();
        pp.printBluetooth();
    }
}