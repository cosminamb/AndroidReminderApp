package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton add;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reminder_list);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        add = findViewById(R.id.FAB_add_reminder);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newReminder();
            }
        });
    }


    public void newReminder(){
        System.out.println("new reminder app");
        startActivity(new Intent(MainActivity.this, AddNewReminder.class));
    }


    @Override
    protected void onResume() {
        super.onResume();



    }

    public void addEvent(EventType event){

    }



}
