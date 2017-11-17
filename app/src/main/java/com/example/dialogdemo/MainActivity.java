package com.example.dialogdemo;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnQuit;
    Button btnPickDateDefault;
    Button btnPickDateMyCalenderStyle;
    Button btnPickDateMySpinnerStyle;
    Button btnPickDateSpinnerDark;
    Button btnPickDateSpinnerLight;
    Button btnPickDateBuilder;


    TextView tvDate;
    AlertDialog.Builder builder;
    DatePickerDialog.Builder dateBuilder;
    static final String TAG="DialogDemo";
    int day, month, year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Alert Dialog created by AlertDialog.Builder
         */
        btnQuit = (Button) findViewById(R.id.btnQuit);
        btnQuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(getResources().getString(R.string.alerttDialogTitle));
                builder.setMessage(getResources().getString(R.string.alerttDialogMessage));
                builder.setCancelable(false);
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i(TAG,"From AlertDialog MainActivity information");
                        Log.d(TAG,"From AlertDialog MainActivity information");
                        Log.e(TAG,"From AlertDialog MainActivity information");
                        MainActivity.this.finish();
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog mydialog = builder.create();
                mydialog.show();
            }
        });


        /*
         * Date Picker Dialog created with App Default Style
         */
        btnPickDateDefault = (Button) findViewById(R.id.btnPickADateDefault);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateDefault.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DATE);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                //tvDate.setText((month + 1) +"/" + day + "/" + year);
                tvDate.setText("");

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                //DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, R.style.MyCalandarDatePickerStyle, new DatePickerDialog.OnDateSetListener() {
                //DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, R.style.MySpinnerDatePickerStyle, new DatePickerDialog.OnDateSetListener() {
                //DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Light_Dialog, new DatePickerDialog.OnDateSetListener() {
                //DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year = i;
                        month = i1;
                        day = i2;
                        tvDate.setText((month + 1) +"/" + day + "/" + year);
                    }
                }, year, month, day);
                myDateDialog.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                myDateDialog.setMessage(getResources().getString(R.string.dateAlerttDialogMessage));
                myDateDialog.show();
            }
        });


        /*
         * Date Picker Dialog created with my R.style.MyCalendarDatePickerStyle
         */
        btnPickDateMyCalenderStyle = (Button) findViewById(R.id.btnPickADateMyCalendar);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateMyCalenderStyle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DATE);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                //tvDate.setText((month + 1) +"/" + day + "/" + year);
                tvDate.setText("");

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, R.style.MyCalendarDatePickerStyle, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year = i;
                        month = i1;
                        day = i2;
                        tvDate.setText((month + 1) +"/" + day + "/" + year);
                    }
                }, year, month, day);
                myDateDialog.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                myDateDialog.setMessage(getResources().getString(R.string.dateAlerttDialogMessage));
                myDateDialog.show();
            }
        });


        /*
         * Date Picker Dialog created with my R.style.MySpinnerDatePickerStyle
         */
        btnPickDateMySpinnerStyle = (Button) findViewById(R.id.btnPickADateMySpinner);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateMySpinnerStyle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DATE);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                //tvDate.setText((month + 1) +"/" + day + "/" + year);
                tvDate.setText("");

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, R.style.MySpinnerDatePickerStyle, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year = i;
                        month = i1;
                        day = i2;
                        tvDate.setText((month + 1) +"/" + day + "/" + year);
                    }
                }, year, month, day);
                myDateDialog.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                myDateDialog.setMessage(getResources().getString(R.string.dateAlerttDialogMessage));
                myDateDialog.show();
            }
        });


        /*
         * Date Picker Dialog created with Android's android.R.style.Theme_Holo_Dialog
         */
        btnPickDateSpinnerDark = (Button) findViewById(R.id.btnPickADateSpinnerDark);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateSpinnerDark.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DATE);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                //tvDate.setText((month + 1) +"/" + day + "/" + year);
                tvDate.setText("");

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year = i;
                        month = i1;
                        day = i2;
                        tvDate.setText((month + 1) +"/" + day + "/" + year);
                    }
                }, year, month, day);
                myDateDialog.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                myDateDialog.setMessage(getResources().getString(R.string.dateAlerttDialogMessage));
                myDateDialog.show();
            }
        });


        /*
         * Date Picker Dialog created with Android's android.R.style.Theme_Holo_Light_Dialog
         */
        btnPickDateSpinnerLight = (Button) findViewById(R.id.btnPickADateSpinnerLight);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateSpinnerLight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DATE);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                //tvDate.setText((month + 1) +"/" + day + "/" + year);
                tvDate.setText("");

                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Light_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year = i;
                        month = i1;
                        day = i2;
                        tvDate.setText((month + 1) +"/" + day + "/" + year);
                    }
                }, year, month, day);
                myDateDialog.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                myDateDialog.setMessage(getResources().getString(R.string.dateAlerttDialogMessage));
                myDateDialog.show();
            }
        });


        /*
         * Date Picker Dialog created by DatePickerDialog.Builder using my R.layout.date_picker_calendar
         */
        btnPickDateBuilder = (Button) findViewById(R.id.btnPickADateBuilder);
        tvDate = (TextView) findViewById(R.id.tvDatePicked);
        btnPickDateBuilder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvDate.setText("");

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View dpview = inflater.inflate(R.layout.date_picker_calendar, null, false);
                //View dpview = inflater.inflate(R.layout.date_picker_spinner, null, false);

                final DatePicker datePicker = dpview.findViewById(R.id.myDatePicker);

                dateBuilder = new DatePickerDialog.Builder(MainActivity.this);
                dateBuilder.setView(datePicker);
                dateBuilder.setTitle(getResources().getString(R.string.dateAlerttDialogTitle));
                dateBuilder.setMessage(R.string.dateAlerttDialogMessage);
                dateBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        month = datePicker.getMonth();
                        day = datePicker.getDayOfMonth();
                        year = datePicker.getYear();
                        tvDate.setText((month + 1) + "/" + day + "/" + year);
                        dialog.cancel();
                    }
                });
                dateBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });

                AlertDialog myDateDialog = dateBuilder.create();
                myDateDialog.show();
            }
        });
    }
}
