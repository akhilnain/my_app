package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_My_Attendance extends Fragment  {
    BarChart student_bar_chart;//Adding a BarChart To Java Code
    BarDataSet barDataSet;
    BarData barData;
    ArrayList<String> lable_name =new ArrayList<>();//Array to store Lables to all Xaxis


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment__student__nav__my__attendance, container, false);

        //setting barchart
        student_bar_chart=view.findViewById(R.id.barchart_student);

        //get data from activity in form of bundal
        Bundle bundle=getArguments();
        String UserId=bundle.getString("userId");


        //setting a arraylist to store Bar Entry of the flow chart
        ArrayList<BarEntry> attendance=new ArrayList<>();
       if(UserId.equals("2818061")){
        //adding values into arraylist
        attendance.add(new BarEntry(0,80));
        attendance.add(new BarEntry(1,70));
        attendance.add(new BarEntry(2,60));
        attendance.add(new BarEntry(3,85));
        attendance.add(new BarEntry(4,33));
       }
       if(UserId.equals("2818179")){
           //adding values into arraylist
           attendance.add(new BarEntry(0,90));
           attendance.add(new BarEntry(1,70));
           attendance.add(new BarEntry(2,20));
           attendance.add(new BarEntry(3,50));
           attendance.add(new BarEntry(4,33));
       }
       if(UserId.equals("2818012")){
           //adding values into arraylist
           attendance.add(new BarEntry(0,60));
           attendance.add(new BarEntry(1,78));
           attendance.add(new BarEntry(2,90));
           attendance.add(new BarEntry(3,40));
           attendance.add(new BarEntry(4,33));
       }
       if(UserId.equals("2818149")){
           //adding values into arraylist
           attendance.add(new BarEntry(0,55));
           attendance.add(new BarEntry(1,73));
           attendance.add(new BarEntry(2,90));
           attendance.add(new BarEntry(3,85));
           attendance.add(new BarEntry(4,33));
       }
       if(UserId.equals("2818069")){
            //adding values into arraylist
            attendance.add(new BarEntry(0,95));
            attendance.add(new BarEntry(1,95));
            attendance.add(new BarEntry(2,95));
            attendance.add(new BarEntry(3,95));
            attendance.add(new BarEntry(4,33));

        }

        //adding values in arraylist
        lable_name.add("ACA");
        lable_name.add("CD");
        lable_name.add("CN");
        lable_name.add("ULP");
        lable_name.add("SSIC");

        //setting up Xaxis data and data featues
        XAxis xAxis=student_bar_chart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(lable_name));
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setLabelCount(lable_name.size());
        xAxis.setLabelRotationAngle(270);
        xAxis.setTextSize(16f);
        xAxis.setTextColor(Color.WHITE);

        //passing attendance array to dataset with lable Attendance
        barDataSet=new BarDataSet(attendance,"Attendance");

        //passing dataset to bardata
        barData=new BarData(barDataSet);
        student_bar_chart.setData(barData);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);
        student_bar_chart.animateY(2000);
        return view;


    }

}