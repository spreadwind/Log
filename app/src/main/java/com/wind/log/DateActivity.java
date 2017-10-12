package com.wind.log;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class DateActivity extends AppCompatActivity {

    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year,
                                            int month, int dayOfMonth) {
//                Toast.makeText(DateActivity.this, "选择的日期为"+year+"年"+(month+1)+"月"+
//                        dayOfMonth+"日", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                String date = year+"-"+(month+1)+"-"+dayOfMonth;
                intent.putExtra("date_return", date);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
