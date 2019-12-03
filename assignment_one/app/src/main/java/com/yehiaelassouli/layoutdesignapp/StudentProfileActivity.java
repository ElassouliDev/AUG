package com.yehiaelassouli.layoutdesignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        String level= getIntent().getStringExtra("level");
        String degree= ""+ getIntent().getFloatExtra("degree",0);



        ((TextView)findViewById(R.id.student_name)).setText(name);
        ((TextView)findViewById(R.id.text_view_student_name)).setText(name);
        ((TextView)findViewById(R.id.textView_studentLevel)).setText(level);
        ((TextView)findViewById(R.id.textView_student_level)).setText(level);
        ((TextView)findViewById(R.id.textView_student_age)).setText(age);
        ((TextView)findViewById(R.id.text_view_student_degree)).setText(degree);


    }
}
