package com.sinzore.printerversiontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sinzore.printertwo.PrintActivity;

public class MyPrintingActivity extends AppCompatActivity {

    private final PrintActivity pp = new PrintActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pp.printBluetooth();
    }


}