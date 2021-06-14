package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_Student_Work_Report extends Fragment {
    Spinner subject_spinner;
    TextView student_report;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__student__nav__student__work__report, container, false);


        student_report=view.findViewById(R.id.student_work_report);
        subject_spinner=view.findViewById(R.id.subject_spinner2);

        subject_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String string= parent.getSelectedItem().toString();
                if(string.equals("Choose any Subject")){
                    student_report.setText("");
                }
                if(string.equals("ULP")){
                    student_report.setBackgroundResource(R.drawable.home_box_shapes);
                    student_report.setText(
                            "1\tFriday, 07 May 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:May 7 2021 4:15PM\t\n" +"\n"+
                            "2\tWednesday, 05 May 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:May 5 2021 4:58PM\t\n" +"\n"+
                            "3\tTuesday, 04 May 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:May 4 2021 3:36PM\t\n" +"\n"+
                            "4\tFriday, 30 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 30 2021 5:03PM\t\n" +"\n"+
                            "5\tWednesday, 28 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Apr 28 2021 4:06PM\t\n" +"\n"+
                            "6\tTuesday, 27 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 27 2021 2:07PM\t\n" +"\n"+
                            "7\tFriday, 23 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 23 2021 3:18PM\t\n" +"\n"+
                            "8\tWednesday, 21 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Apr 21 2021 4:24PM\t\n" +"\n"+
                            "9\tTuesday, 20 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 20 2021 12:54PM\t\n" +"\n"+
                            "10\tTuesday, 13 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 13 2021 2:39PM\t\n" +"\n"+
                            "11\tFriday, 09 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 9 2021 4:06PM\t\n" +"\n"+
                            "12\tWednesday, 07 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Apr 7 2021 2:39PM\t\n" +"\n"+
                            "13\tTuesday, 06 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 6 2021 2:06PM\t\n" +"\n"+
                            "14\tFriday, 02 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Apr 2 2021 12:54PM\t\n" +"\n"+
                            "15\tWednesday, 31 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Mar 31 2021 2:36PM\t\n" +"\n"+
                            "16\tTuesday, 30 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 30 2021 12:02PM\t\n" +"\n"+
                            "17\tFriday, 26 Mar 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 26 2021 12:31PM\t\n" +"\n"+
                            "18\tWednesday, 24 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Mar 24 2021 3:06PM\t\n" +"\n"+
                            "19\tTuesday, 23 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 23 2021 2:38PM\t\n" +"\n"+
                            "20\tFriday, 19 Mar 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 19 2021 4:15PM\t\n" +"\n"+
                            "21\tWednesday, 17 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Mar 17 2021 2:53PM\t\n" +"\n"+
                            "22\tTuesday, 16 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 16 2021 3:02PM\t\n" +"\n"+
                            "23\tWednesday, 10 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Mar 10 2021 4:06PM\t\n" +"\n"+
                            "24\tTuesday, 09 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 9 2021 3:54PM\t\n" +"\n"+
                            "25\tFriday, 05 Mar 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 5 2021 3:37PM\t\n" +"\n"+
                            "26\tWednesday, 03 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present\t  Karun Handa::E9596 on dated:Mar 3 2021 4:16PM\t\n" +"\n"+
                            "27\tTuesday, 02 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present\t  Karun Handa::E9596 on dated:Mar 2 2021 11:16AM\t\n" +"\n"+
                            "28\tFriday, 26 Feb 2021\tLecture\t11:00 - 11:45 AM\t  Present\t  Karun Handa::E9596 on dated:Feb 26 2021 3:03PM\t\n" +"\n"+
                            "29\tWednesday, 24 Feb 2021\tLecture\t1:00 - 1:45 PM\t  Present\t   Karun Handa::E9596 on dated:Feb 24 2021 2:19PM");
                }
                if(string.equals("ACA")){
                    student_report.setBackgroundResource(R.drawable.home_box_shapes);
                    student_report.setText(
                            "1    Wednesday, 05 May 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:May 5  2021 10:39PM \n" +"\n"+
                            "2    Monday   , 03 May 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:May 4  2021 10:39AM \n" +"\n"+
                            "3    Wednesday, 28 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 28 2021 4:02PM  \n" +"\n"+
                            "4    Monday   , 26 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 26 2021 3:27PM  \n" +"\n"+
                            "5    Wednesday, 21 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 22 2021 10:58AM \n" +"\n"+
                            "6    Monday   , 19 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 20 2021 10:14AM \n" +"\n"+
                            "7    Monday   , 12 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 12 2021 3:30PM  \n" +"\n"+
                            "8    Wednesday, 07 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 7  2021 6:54PM  \n" +"\n"+
                            "9    Monday   , 05 Apr 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 5  2021 10:41PM \n" +"\n"+
                            "10   Wednesday, 31 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Apr 1  2021 11:23AM \n" +"\n"+
                            "11   Wednesday, 24 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 25 2021 10:10AM \n" +"\n"+
                            "12   Monday   , 22 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 23 2021 12:16AM \n" +"\n"+
                            "13   Wednesday, 17 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 17 2021 4:26PM  \n" +"\n"+
                            "14   Monday   , 15 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 16 2021 4:15PM  \n" +"\n"+
                            "15   Wednesday, 10 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 10 2021 4:28PM  \n" +"\n"+
                            "16   Monday   , 08 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 8  2021 5:56PM  \n" +"\n"+
                            "17   Wednesday, 03 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 3  2021 9:30PM  \n" +"\n"+
                            "18   Monday   , 01 Mar 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Mar 1  2021 10:04PM \n" +"\n"+
                            "19   Wednesday, 24 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 24 2021 10:13PM \n" +"\n"+
                            "20   Monday   , 22 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 23 2021 10:56AM \n" +"\n"+
                            "21   Wednesday, 17 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 17 2021 11:43PM \n" +"\n"+
                            "22   Monday   , 15 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 15 2021 2:41PM  \n" +"\n"+
                            "23   Wednesday, 10 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 11 2021 11:35AM \n" +"\n"+
                            "24   Monday   , 08 Feb 2021   Lecture    12:00 - 12:45 PM  Present    \tKirti::E8770 on dated:Feb 9  2021 10:22AM \n");

                }
                if(string.equals("CN")){
                    student_report.setBackgroundResource(R.drawable.home_box_shapes);
                    student_report.setText(
                            "1\tThursday, 06 May 2021\tLecture\t12:00 - 12:45 PM\t  Present \tShekhar Singh::E6213 on dated:May 7 2021 4:09PM\t\n" +"\n"+
                            "2\tWednesday, 05 May 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:May 5 2021 4:55PM\t\n" +"\n"+
                            "3\tMonday, 03 May 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:May 3 2021 5:06PM\t\n" +"\n"+
                            "4\tThursday, 29 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 29 2021 4:14PM\t\n" +"\n"+
                            "5\tWednesday, 28 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Apr 28 2021 6:16PM\t\n" +"\n"+
                            "6\tMonday, 26 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 26 2021 9:03PM\t\n" +"\n"+
                            "7\tThursday, 22 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 22 2021 5:11PM\t\n" +"\n"+
                            "8\tWednesday, 21 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Apr 21 2021 2:36PM\t\n" +"\n"+
                            "9\tMonday, 19 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 19 2021 2:59PM\t\n" +"\n"+
                            "10\tMonday, 12 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 12 2021 5:39PM\t\n" +"\n"+
                            "11\tThursday, 08 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 8 2021 4:15PM\t\n" +"\n"+
                            "12\tWednesday, 07 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Apr 7 2021 1:50PM\t\n" +"\n"+
                            "13\tMonday, 05 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 5 2021 4:51PM\t\n" +"\n"+
                            "14\tThursday, 01 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Apr 1 2021 3:06PM\t\n" +"\n"+
                            "15\tWednesday, 31 Mar 2021\tLecture\t10:00 - 10:45 AM\tPresent\tShekhar Singh::E6213 on dated:Mar 31 2021 3:41PM\t\n" +"\n"+
                            "16\tThursday, 25 Mar 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 25 2021 3:16PM\t\n" +"\n"+
                            "17\tWednesday, 24 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Mar 24 2021 1:50PM\t\n" +"\n"+
                            "18\tMonday, 22 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 22 2021 3:55PM\t\n" +"\n"+
                            "19\tThursday, 18 Mar 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 18 2021 2:22PM\t\n" +"\n"+
                            "20\tWednesday, 17 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Mar 17 2021 3:15PM\t\n" +"\n"+
                            "21\tMonday, 15 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 16 2021 9:51AM\t\n" +"\n"+
                            "22\tWednesday, 10 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tShekhar Singh::E6213 on dated:Mar 10 2021 11:29AM\t\n" +"\n"+
                            "23\tMonday, 08 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 8 2021 2:58PM\t\n" +"\n"+
                            "24\tThursday, 04 Mar 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tShekhar Singh::E6213 on dated:Mar 5 2021 9:49AM\t");

                }
                if(string.equals("CD")){
                    student_report.setBackgroundResource(R.drawable.home_box_shapes);
                    student_report.setText(
                            "1\tFriday, 07 May 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:May 8 2021 10:43AM\t\n" +"\n"+
                            "2\tThursday, 06 May 2021\tLecture\t11:00 - 11:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:May 6 2021 7:23PM\t\n" +"\n"+
                            "3\tTuesday, 04 May 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:May 4 2021 3:30PM\t\n" +"\n"+
                            "4\tFriday, 30 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 30 2021 1:59PM\t\n" +"\n"+
                            "5\tThursday, 29 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 29 2021 12:34PM\t\n" +"\n"+
                            "6\tTuesday, 27 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 27 2021 9:25PM\t\n" +"\n"+
                            "7\tFriday, 23 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 24 2021 1:03AM\t\n" +"\n"+
                            "8\tThursday, 22 Apr 2021\tLecture\t11:00 - 11:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 23 2021 10:01AM\t\n" +"\n"+
                            "9\tTuesday, 20 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 21 2021 9:37AM\t\n" +"\n"+
                            "10\tTuesday, 13 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 14 2021 9:22AM\t\n" +"\n"+
                            "11\tFriday, 09 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 10 2021 12:39AM\t\n" +"\n"+
                            "12\tThursday, 08 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 9 2021 10:02AM\t\n" +"\n"+
                            "13\tTuesday, 06 Apr 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 7 2021 1:23AM\t\n" +"\n"+
                            "14\tFriday, 02 Apr 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 3 2021 12:01AM\t\n" +"\n"+
                            "15\tThursday, 01 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:Apr 2 2021 12:40AM\t\n" +"\n"+
                            "16\tTuesday, 30 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Mar 31 2021 10:28AM\t\n" +"\n"+
                            "17\tFriday, 26 Mar 2021\tLecture\t12:00 - 12:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Mar 27 2021 9:45AM\t\n" +"\n"+
                            "18\tThursday, 25 Mar 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tNeeraj Taygi::E10098 on dated:Mar 26 2021 12:46AM\t\n" +"\n"+
                            "19\tTuesday, 23 Mar 2021\tLecture\t1:00 - 1:45 PM\t  Present  \tNeeraj Taygi::E10098 on dated:Mar 23 2021 4:33PM");

                }
                if(string.equals("SSIC")){
                    student_report.setBackgroundResource(R.drawable.home_box_shapes);
                    student_report.setText(
                            "1\tFriday, 07 May 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:May 7 2021 9:15PM\t\n" +"\n"+
                            "2\tThursday, 06 May 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tJagmohan::E8053 on dated:May 7 2021 9:44AM\t\n" +"\n"+
                            "3\tFriday, 30 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:May 1 2021 11:02AM\t\n" +"\n"+
                            "4\tThursday, 29 Apr 2021\tLecture\t10:00 - 10:45 AM\t  Present  \tJagmohan::E8053 on dated:Apr 30 2021 9:42AM\t\n" +"\n"+
                            "5\tFriday, 23 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Apr 24 2021 9:44AM\t\n" +"\n"+
                            "6\tThursday, 22 Apr 2021\tLecture\t10:00 - 10:45 AM  \tPresent  \tJagmohan::E8053 on dated:Apr 23 2021 10:15AM\t\n" +"\n"+
                            "7\tMonday, 12 Apr 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Apr 13 2021 9:29AM\t\n" +"\n"+
                            "8\tFriday, 09 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Apr 9 2021 5:26PM\t\n" +"\n"+
                            "9\tMonday, 05 Apr 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Apr 5 2021 6:16PM\t\n" +"\n"+
                            "10\tFriday, 02 Apr 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Apr 3 2021 10:44AM\t\n" +"\n"+
                            "11\tFriday, 26 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 27 2021 9:50AM\t\n" +"\n"+
                            "12\tMonday, 22 Mar 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 22 2021 4:07PM\t\n" +"\n"+
                            "13\tFriday, 19 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 22 2021 4:02PM\t\n" +"\n"+
                            "14\tMonday, 15 Mar 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 15 2021 11:55PM\t\n" +"\n"+
                            "15\tMonday, 08 Mar 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 8 2021 4:32PM\t\n" +"\n"+
                            "16\tFriday, 05 Mar 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 5 2021 6:39PM\t\n" +"\n"+
                            "17\tMonday, 01 Mar 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Mar 1 2021 4:04PM\t\n" +"\n"+
                            "18\tFriday, 26 Feb 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 26 2021 3:09PM\t\n" +"\n"+
                            "19\tMonday, 22 Feb 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 22 2021 3:52PM\t\n" +"\n"+
                            "20\tFriday, 19 Feb 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 19 2021 3:26PM\t\n" +"\n"+
                            "21\tMonday, 15 Feb 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 15 2021 4:02PM\t\n" +"\n"+
                            "22\tFriday, 12 Feb 2021\tLecture\t1:45 - 2:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 13 2021 9:53AM\t\n" +"\n"+
                            "23\tMonday, 08 Feb 2021\tLecture\t2:45 - 3:30 PM\t  Present  \tJagmohan::E8053 on dated:Feb 8 2021 7:48PM\t\n");

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}