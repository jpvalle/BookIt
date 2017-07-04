package com.summercodingproject.bookit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class myCalendar extends AppCompatActivity {

    DatePicker dp;
    Calendar myCalendar;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        context = this;
        dp = (DatePicker)findViewById(R.id.datePicker);
        setUpCalendar();
    }

    private void setUpCalendar() {
        myCalendar = myCalendar.getInstance();
        int today = myCalendar.get(Calendar.DAY_OF_MONTH);
        dp.setMinDate(today);

        int cutoff = today + 180;

        dp.setMaxDate(cutoff);

        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"CALENDAR TOUCHED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
