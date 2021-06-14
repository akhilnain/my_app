package com.example.digicollage.LoginActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digicollage.Home.Home_Activity_Student;
import com.example.digicollage.R;

public class LoginActivityStudent extends AppCompatActivity {
    private Button login_button_student,signup_button_student;
    private EditText userId,userPassword;
    private TextView alert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);



      //connecting button to java code
        signup_button_student=findViewById(R.id.btSignup);
        login_button_student=findViewById(R.id.btLogin);
        //connecting edit text to java code
        alert=findViewById(R.id.alert_message_student_login_activity);
        userId=findViewById(R.id.userId);
        userPassword=findViewById(R.id.userPassword);


        //setting on click listener on login button
        login_button_student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {//add logic for verification of Id and password entered
                if(!(userId.getText().toString().equals("")||userPassword.getText().toString().equals("")))
                {
                   if(userId.getText().toString().equals("2818061")&&userPassword.getText().toString().equals("piet"))
                   {
                        Intent intent=new Intent(LoginActivityStudent.this, Home_Activity_Student.class);
                        intent.putExtra("userId",userId.getText().toString());
                        startActivity(intent);
                        finish();//to finish the activity so that when we back pressed we exit app

                   }
                   else if (userId.getText().toString().equals("2818179")&&userPassword.getText().toString().equals("piet"))
                   {
                       Intent intent=new Intent(LoginActivityStudent.this, Home_Activity_Student.class);
                       intent.putExtra("userId",userId.getText().toString());
                       startActivity(intent);
                       finish();//to finish the activity so that when we back pressed we exit app


                   }
                   else if(userId.getText().toString().equals("2818149")&&userPassword.getText().toString().equals("piet"))
                   {
                       Intent intent=new Intent(LoginActivityStudent.this, Home_Activity_Student.class);
                       intent.putExtra("userId",userId.getText().toString());
                       startActivity(intent);
                       finish();//to finish the activity so that when we back pressed we exit app

                   }
                   else if(userId.getText().toString().equals("2818012")&&userPassword.getText().toString().equals("piet"))
                   {
                       Intent intent=new Intent(LoginActivityStudent.this, Home_Activity_Student.class);
                       intent.putExtra("userId",userId.getText().toString());
                       startActivity(intent);
                       finish();//to finish the activity so that when we back pressed we exit app
                   }
                   else if(userId.getText().toString().equals("2818069")&&userPassword.getText().toString().equals("piet"))

                   {
                       Intent intent=new Intent(LoginActivityStudent.this, Home_Activity_Student.class);
                       intent.putExtra("userId",userId.getText().toString());
                       startActivity(intent);
                       finish();//to finish the activity so that when we back pressed we exit app

                   }
                   else
                       {
                       alert.setText("User ID or Password is Wrong");
                   }
                }
                else
                    {
                        alert.setText("Enter Data Properly");
                    }

            }
        }
        );

        //setting on click listener on signup button
        signup_button_student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+"pietadminstration@gmail.com"+"?subject="+Uri.encode("Creating Of Clg Id")+"&body="+
                        Uri.encode(("I am here by requesting you to Create a clg id for myself as soon as possible " +
                                "\n" +
                                "Roll Number : 2818*** \n Contact Number : 93065*****"))));
                //startActivity(Intent.createChooser(intent,"choose One app"));
                startActivity(intent);
            }
        }
        );
    }
}