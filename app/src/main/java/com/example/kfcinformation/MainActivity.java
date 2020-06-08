package com.example.kfcinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        information="KFC is a group of resturants was established in 1930 and now it is present in most countries in the world";
        TextView hello=findViewById(R.id.hello);
        hello.setText(information);
    }
}
