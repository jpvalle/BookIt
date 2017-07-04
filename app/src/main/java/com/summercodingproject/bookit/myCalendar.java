package com.summercodingproject.bookit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Calendar;

public class myCalendar extends AppCompatActivity {

    Button dp;
    Calendar calendar;
    int curDay;
    int curMonth;
    int curYear;
    int selDay;
    int selMonth;
    int selYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calendar = Calendar.getInstance();
        curDay = calendar.get(Calendar.DAY_OF_MONTH);
        curMonth = calendar.get(Calendar.MONTH);
        curYear = calendar.get(Calendar.YEAR);
        String curDate = String.format("%d/%d/%d",curMonth,curDay,curYear);

        setContentView(R.layout.activity_calendar);
        dp = (Button) findViewById(R.id.datePicker);
        dp.setText(curDate);
        dp.setTextSize(80);
        dp.setBackgroundColor(500);
    }

}
