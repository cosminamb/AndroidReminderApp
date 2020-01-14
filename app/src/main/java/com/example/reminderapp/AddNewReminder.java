package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddNewReminder extends AppCompatActivity {

    public static final String LOG_TAG = AddNewReminder.class.getSimpleName();


    Button dateButton;
    Dialog dateDialog;

    Button timeButton;
    Dialog timeDialog;


    Button setButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_reminder);

        dateButton = findViewById(R.id.set_date);
        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePopUp();
            }
        });

        timeButton = findViewById(R.id.set_time);
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimePopUp();
            }
        });
    }

    public void openDatePopUp(){
        //System.out.println("date click");
        Log.d(LOG_TAG, "DATE PICK CLICKED");
        dateDialog = new Dialog(AddNewReminder.this);
        dateDialog.show();
        dateDialog.setContentView(R.layout.activity_date_pop_up);
        //dateDialog.setTitle("DIALOG");
        //startActivity(new Intent(AddNewReminder.this, DatePopUp.class));


    }

    public void openTimePopUp(){
        timeDialog = new Dialog(AddNewReminder.this);
        timeDialog.show();
        timeDialog.setContentView(R.layout.activity_time_pop_up);
    }

    @Override
    protected void onResume() {
        super.onResume();

        setButton = findViewById(R.id.set);
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setAndGoBack();
            }
        });


    }

    public void setAndGoBack(){
        this.finish();
    }
}
