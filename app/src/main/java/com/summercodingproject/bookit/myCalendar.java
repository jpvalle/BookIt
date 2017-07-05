package com.summercodingproject.bookit;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

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
    private final static int DILOG_ID = 0;

    private DatePickerDialog.OnDateSetListener dpickerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calendar = Calendar.getInstance();
        curDay = calendar.get(Calendar.DAY_OF_MONTH);
        curMonth = calendar.get(Calendar.MONTH);
        curYear = calendar.get(Calendar.YEAR);
        selDay = curDay;
        selMonth = curMonth;
        selYear = curYear;

        String curDate = String.format("%d/%d/%d",curMonth,curDay,curYear);

        setContentView(R.layout.activity_calendar);
        dp = (Button) findViewById(R.id.datePicker);
        dp.setText(curDate);
        dp.setTextSize(80);
        dp.setBackgroundColor(Color.DKGRAY);
        dp.setTextColor(Color.WHITE);
        //dp.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);

        dpickerListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                selYear = year;
                selMonth = month;
                selDay = dayOfMonth;
                String curDate = String.format("%d/%d/%d",selMonth,selDay,selYear);
                dp.setText(curDate);
            }
        };

        showDialogueOnButtonClick();
    }

    public void showDialogueOnButtonClick(){
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DILOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id == DILOG_ID){
            return new DatePickerDialog(this, dpickerListener, selYear, selMonth, selDay);
        }else{
            return null;
        }
    }
}
