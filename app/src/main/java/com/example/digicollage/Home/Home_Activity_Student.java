package com.example.digicollage.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.digicollage.MainActivity;
import com.example.digicollage.R;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Assignment_Upload;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Class_Home_Work;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Home;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Leave_Application;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_My_Attendance;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_My_Time_Table;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Scheme_Syllabus;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Student_Work_Report;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Study_Material;
import com.example.digicollage.Student_Activity_Nav_Fragments.Fragment_Student_Nav_Teacher_Work_Report;
import com.google.android.material.navigation.NavigationView;

public class Home_Activity_Student extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigation_view_homeactivity_student;
    TextView student_id,student_name;
    private Toolbar student_home_activity_toolbar;
    private Toolbar getStudent_home_activity_toolbar2;
    //ImageView btSetting, btHome;
    static String mUserId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_student2);



        //adding custom toolbar
        student_home_activity_toolbar = findViewById(R.id.student_home_activity_tool_bar);
        getStudent_home_activity_toolbar2=findViewById(R.id.student_home_activity_tool_bar2);
        setSupportActionBar(getStudent_home_activity_toolbar2);


        //adding  drawer layout for student home activity to java code
        mdrawerlayout = findViewById(R.id.drawer_menu_home_screen_student);

        //adding navigation view into java code
        navigation_view_homeactivity_student = findViewById(R.id.navigation_view_homeactivity_student);
        View mheader = navigation_view_homeactivity_student.getHeaderView(0);
        // add student id textview from header file of navigation view to
        // java file for adding id of user from login screen
        student_id = mheader.findViewById(R.id.student_id);
        student_name=mheader.findViewById(R.id.student_name);

        //setting on click item listener by implementing it directly to class and
        // passing content as this
        navigation_view_homeactivity_student.setNavigationItemSelectedListener(this);

        //getting data from intent LoginActivity
        Intent intent = getIntent();
        mUserId = intent.getStringExtra("userId");

        //for showing name in header
        if(mUserId.equals("2818069")){
            student_name.setText("Vaibhavi Gaur");
            student_id.setText("vaibhavigaur2001@gmail.com");
        }
        if(mUserId.equals("2818149")){
            student_name.setText("Angel Gaur");
            student_id.setText("agaur2262@gmail.com");
        }
        if(mUserId.equals("2818012")){
            student_name.setText("Sonam");
            student_id.setText("sonam@gmail.com");
        }
        if(mUserId.equals("2818061")){
            student_name.setText("Gaurav Chopra");
            student_id.setText("gchopra666@gmail.com");
        }
        if(mUserId.equals("2818179")){
            student_name.setText("Sahab Singh");
            student_id.setText("akhil.nain.1430@gmail.com");
        }


        //setting drawer layout with actionbar drawer toggle a
        toggle = new ActionBarDrawerToggle(this, mdrawerlayout,
                student_home_activity_toolbar, R.string.open, R.string.close);
        mdrawerlayout.addDrawerListener(toggle);
        toggle.syncState();
        //showing Action bar on navigation view


        //adding condiction so when we open this activity
        // first/ setted item is selected  automaticlly
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Fragment_Student_Nav_Home()).commit();
        }

    }
    //method to add 2nd toolbar to layout
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_screen_drawer_menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //on item select listener for 2nd tool bar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home_btn:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Home()).commit();
                break;

            case R.id.change_password:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Home()).addToBackStack("1").commit();
                break;

            case R.id.logout:
                //Toast.makeText(this, "working", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
        }
        return true;
    }
    //overridding onBackPressed menthod so that in case when be press back button
    // when drawer is open is close drawer

    @Override
    public void onBackPressed() {

        if (mdrawerlayout.isDrawerOpen(GravityCompat.START)) {
            mdrawerlayout.closeDrawer(GravityCompat.START);
        }
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if(count!=0){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Fragment_Student_Nav_Home()).commit();

        }
        super.onBackPressed();
    }
    //Writing on click item listener  function and setting the functionality
    // on each item clicked on nav.view

    @Override
    public boolean onNavigationItemSelected(@NonNull  MenuItem item) {

        switch (item.getItemId()){
            case R.id.assignment_upload:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Assignment_Upload()).addToBackStack("1").commit();
                break;
            case R.id.my_attendance:
                FragmentManager attendance_manager=getSupportFragmentManager();
                final    FragmentTransaction attandance_transaction=attendance_manager.beginTransaction();
                final   Fragment_Student_Nav_My_Attendance my_attendance=
                        new Fragment_Student_Nav_My_Attendance();
                Bundle attendancebundle=new Bundle();
                attendancebundle.putString("userId",mUserId);
                my_attendance.setArguments(attendancebundle);
                attandance_transaction.replace(R.id.fragment_container,my_attendance);
                attandance_transaction.addToBackStack("1").commit();
                break;

            case R.id.my_scheme_syllabus:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Scheme_Syllabus()).addToBackStack("1").commit();
                break;
            case R.id.my_timetable:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_My_Time_Table()).addToBackStack("1").commit();
                break;
            case R.id.student_leave_application:
                FragmentManager leave_app_manager=getSupportFragmentManager();
                final FragmentTransaction leave_app_transaction=leave_app_manager.beginTransaction();
                final Fragment_Student_Nav_Leave_Application leave_app=
                        new Fragment_Student_Nav_Leave_Application();
                Bundle leave_app_bundle=new Bundle();
                leave_app_bundle.putString("userId",mUserId);
                leave_app.setArguments(leave_app_bundle);
                leave_app_transaction.replace(R.id.fragment_container,leave_app);
                leave_app_transaction.addToBackStack("1").commit();
                break;

            case R.id.class_home_work:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Class_Home_Work()).addToBackStack("1").commit();
                break;

            case R.id.student_work_report:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Student_Work_Report()).addToBackStack("1").commit();
                break;

            case R.id.teacher_work_report:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Teacher_Work_Report()).addToBackStack("1").commit();
                break;
            case R.id.study_material:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment_Student_Nav_Study_Material()).addToBackStack("1").commit();
                break;
        }
        mdrawerlayout.closeDrawer(GravityCompat.START);//closing drawer automatecly when we press
        // any item in nav view
        return true;
    }
}
