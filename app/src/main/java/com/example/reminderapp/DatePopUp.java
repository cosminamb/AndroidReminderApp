package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public class DatePopUp extends AppCompatActivity  {


    DatePicker datePicker;
    Date date;
    Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pop_up);

        /*
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        getWindow().setLayout(width,height);

         */

        datePicker = (DatePicker) findViewById(R.id.calendar);
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                calendar = Calendar.getInstance();
                calendar.set(year, month, day);

                //date = (Date) new Date(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
                Log.d("CALENDAR CLICKED", calendar.toString());
                //datePicker.setVisibility(View.GONE);
                setVisible(false);

            }

        });

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                calendar = Calendar.getInstance();
                calendar.set(year, month, day);
                setVisible(false);
                Log.d("Date", "Year=" + year + " Month=" + (month + 1) + " day=" + day);

            }
        });
        /*
        datePicker.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view) {

            }

            @Override
            public void onViewDetachedFromWindow(View view) {

            }
        });

         */

        //Log.d("CALENDAR CLICKED", date.toString());
        //System.out.println("CLICKED" + date.toString());

    }


    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
