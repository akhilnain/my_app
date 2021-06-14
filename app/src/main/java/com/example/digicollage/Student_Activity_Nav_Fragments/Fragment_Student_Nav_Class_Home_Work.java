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
public class Fragment_Student_Nav_Class_Home_Work extends Fragment {
    Spinner subject_spinner;
    TextView home_work;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__student__nav__class_home_work, container, false);
        subject_spinner=view.findViewById(R.id.subject_spinner);
        home_work=view.findViewById(R.id.home_work);

        subject_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String string= parent.getSelectedItem().toString();
               if(string.equals("Choose any Subject")){
                   home_work.setText("");
               }
                if(string.equals("ULP")){
                    home_work.setText("C language programming in Unix/Linux using vi editor & C compiler");
                }
                if(string.equals("ACA")){
                    home_work.setText(" Tasks of superscalar processing – parallel decoding, superscalar instruction issue");

                }
                if(string.equals("CN")){
                    home_work.setText("Protocols: Stop & wait ARQ, Go-Back- N ARQ, sliding window protocols");

                }
                if(string.equals("CD")){
                    home_work.setText("Types of Parsing:- Top Down Parsing, Recursive Descent Parsing");

                }
                if(string.equals("SSIC")){
                    home_work.setText("Soft skills: Need and training");

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}