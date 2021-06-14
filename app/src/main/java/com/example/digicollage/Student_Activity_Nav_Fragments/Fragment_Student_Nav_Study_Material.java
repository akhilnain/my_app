package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;
import com.github.barteksc.pdfviewer.PDFView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_Study_Material extends Fragment {
    Spinner subject_spinner;
    PDFView study_material;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__student__nav__study__material, container, false);
        subject_spinner=view.findViewById(R.id.subject_spinner4);
        study_material=view.findViewById(R.id.pdf_study_material);

        subject_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String string= parent.getSelectedItem().toString();
                if(string.equals("Choose any Subject")){
                    study_material.setVisibility(View.INVISIBLE);

                }
                if(string.equals("ULP")){
                    study_material.setVisibility(View.VISIBLE);
                    study_material.fromAsset("ULP.pdf").load();
                }
                if(string.equals("ACA")){
                    study_material.setVisibility(View.VISIBLE);
                    study_material.fromAsset("ACA.pdf").load();

                }
                if(string.equals("CN")){
                    study_material.setVisibility(View.VISIBLE);
                    study_material.fromAsset("CN.pdf").load();
                }
                if(string.equals("CD")){
                    study_material.setVisibility(View.VISIBLE);
                    study_material.fromAsset("CD.pdf").load();

                }
                if(string.equals("SSIC")){
                    study_material.setVisibility(View.VISIBLE);
                    study_material.fromAsset("SSIC.pdf").load();

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        return view;
    }
}