package com.yehiaelassouli.layoutdesignapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListStudentsActivity extends AppCompatActivity {

    List<Student> studentsList = new ArrayList<>();
    RecyclerView student_rv;
    StudentAdapter studentsAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_students);

        initStudent(); // create group of student

        student_rv= findViewById(R.id.students_rv);
        student_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this ,studentsList );
        student_rv.setAdapter(studentsAdapter);



    }


    private void  initStudent(){
        studentsList . add(new Student("Yehia 1 ","20 year", "level 1" , 80));
        studentsList . add(new Student("Yehia 2 ","22 year", "level 2" , 83));
        studentsList . add(new Student("Yehia 3 ","24 year", "level 3" , 84));
        studentsList . add(new Student("Yehia 4 ","26 year", "level 4" , 85));
        studentsList . add(new Student("Yehia 5 ","28 year", "level 5" , 86));
        studentsList . add(new Student("Yehia 6 ","30 year", "level 5" , 82));

    }
}
