package com.example.digicollage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digicollage.LoginActivity.LoginActivityAdmin;
import com.example.digicollage.LoginActivity.LoginActivityStudent;
import com.example.digicollage.LoginActivity.LoginActivityTeacher;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //adding all three imageView to mainactivity
        ImageView ivStudent=findViewById(R.id.student_icon);
        ImageView ivTeacher=findViewById(R.id.teachers_icon);
        ImageView ivAdmin=findViewById(R.id.admin_icon);

        //setting on click listener on student_icon image
        ivStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivityStudent.class);
                startActivity(intent);
                finish();//to finish the activity so that when we back pressed we exit app

            }
        });

        //setting on click listener on teachers_icon image
        ivTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivityTeacher.class);
                startActivity(intent);
                finish();//to finish the activity so that when we back pressed we exit app
            }
        });
        //setting on click listener on admin_icon image
        ivAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivityAdmin.class);
                startActivity(intent);
                finish();//to finish the activity so that when we back pressed we exit app
            }
        });


    }
}