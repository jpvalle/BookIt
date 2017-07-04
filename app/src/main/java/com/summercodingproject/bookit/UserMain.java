package com.summercodingproject.bookit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserMain extends AppCompatActivity {

    Button calendarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        calendarBtn = (Button)findViewById(R.id.userCalendar);
        final Intent i = new Intent(this, myCalendar.class);
        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(i, 200);
            }
        });
        setResult(RESULT_OK);
    }



}
