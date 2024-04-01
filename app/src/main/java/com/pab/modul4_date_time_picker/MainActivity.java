package com.pab.modul4_date_time_picker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.time.MonthDay;
import java.util.Calendar;

public class MainActivity extends
        AppCompatActivity {
    EditText tanggal, waktu;

    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanggal = (EditText)
                findViewById(R.id.tanggal);
        waktu =
                (EditText) findViewById(R.id.waktu);
    }

    public void setTanggal(View v) {
        final Calendar c =
                Calendar.getInstance();
        int thn =
                c.get(Calendar.YEAR);
        int bln = c.get(Calendar.MONTH);
        int tgl = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new
                DatePickerDialog(MainActivity.this, (view, thn1, bln1, tgl1) -> tanggal.setText(tgl1 + "-" + (bln1 + 1) + "-" +
                thn1), thn, bln,
                tgl);
        datePickerDialog.show();
    }

    public void setWaktu(View v) {
        final Calendar c =
                Calendar.getInstance();
        int jam =
                c.get(Calendar.HOUR_OF_DAY);
        int
                menit = c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new
                TimePickerDialog(MainActivity.this, (view, jam1, menit1) -> waktu.setText(jam1 + ":" + menit1), jam, menit, false);
        timePickerDialog.show();
    }
}