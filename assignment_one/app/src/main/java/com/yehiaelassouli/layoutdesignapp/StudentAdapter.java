package com.yehiaelassouli.layoutdesignapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends  RecyclerView.Adapter<StudentAdapter.StudentVh>{

    Context context;
    List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_row,parent , false );

        return new StudentVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVh holder, int position) {
        holder.setData(students.get(position));

    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    class  StudentVh extends RecyclerView.ViewHolder{

        TextView student_name,student_age,student_level,student_degree;
        public StudentVh(@NonNull View itemView) {
            super(itemView);

            student_name = itemView.findViewById(R.id.student_name);
            student_age = itemView.findViewById(R.id.student_age);
            student_level = itemView.findViewById(R.id.student_level);
            student_degree= itemView.findViewById(R.id.student_degree);
        }

        public void setData(final  Student student) {

        student_name.setText(student.getName());
        student_age.setText(student.getAge());
        student_level.setText(student.getLevel());
        student_degree.setText(""+student.getDegree());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, student.getName(), Toast.LENGTH_SHORT).show();
                Intent  intent = new Intent(itemView.getContext() ,StudentProfileActivity.class);
                intent.putExtra("name",student.getName());
                intent.putExtra("age",student.getAge());
                intent.putExtra("level",student.getLevel());
                intent.putExtra("degree",student.getDegree());
                itemView.getContext().startActivity(intent);

            }
        });
        }
    }


}
