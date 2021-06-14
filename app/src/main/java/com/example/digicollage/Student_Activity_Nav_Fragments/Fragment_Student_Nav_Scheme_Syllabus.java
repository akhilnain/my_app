package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;
import com.github.barteksc.pdfviewer.PDFView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_Scheme_Syllabus extends Fragment {
    PDFView scheme_syllabus;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__student__nav__scheme__syllabus, container, false);
        scheme_syllabus=view.findViewById(R.id.pdf_scheme_syllabus);
        scheme_syllabus.fromAsset("BTECH_CSE.pdf").load();
        return view;
    }
}