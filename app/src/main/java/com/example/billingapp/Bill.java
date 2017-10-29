package com.example.billingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

public class Bill extends AppCompatActivity {
    private ItemsDbAdapter dbHelper;
    private SimpleCursorAdapter dataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        dbHelper = new ItemsDbAdapter(this);
        dbHelper.open();
        //Generate ListView from SQLite Database
    }

}
