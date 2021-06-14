package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;

/**
 * A simple {@link Fragment} subclass
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_Home extends Fragment {
    Button piet_website,piet_library,piet_education,important_links,anti_ragging,Fee_payment;
    TextView clg_address;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_student__nav__home_, container, false);
         piet_website=view.findViewById(R.id.piet_web);
         piet_library=view.findViewById(R.id.piet_library);
         piet_education=view.findViewById(R.id.piet_education);
         important_links=view.findViewById(R.id.important_links);
         anti_ragging=view.findViewById(R.id.anti_ragging);
         Fee_payment=view.findViewById(R.id.fee_payment);
         clg_address=view.findViewById(R.id.clg_address);
         clg_address.setText("REACH US\n" +
                 "PIET Campus:\n" +
                 "\n" +
                 "70, Milestone GT Road, Samalkha,Panipat, Haryana - 132102\n" +
                 "India\n" +
                 "\n" +
                 "Call: 1800 120 6884 (Toll Free), 0180-2569700, 2569799, 2569699\n" +
                 "Email: info@piet.co.in");

         piet_website.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.piet.co.in/"));
                 startActivity(intent);
             }
         });
        piet_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.piet.co.in/life-at-piet/education-4-0/"));
                startActivity(intent);
            }
        });
        piet_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://library.piet.co.in/"));
                startActivity(intent);
            }
        });
        Fee_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://paydirect.eduqfix.com/app/5vH+Hk4MWtJmpNIvodJ51SarnAcbTXeQvQMUFUe0uZVTj1dE1rZdzcSJj1HdsAwA/1908"));
                startActivity(intent);
            }
        });
        anti_ragging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.piet.co.in/wp-content/uploads/2021/04/Anti-Ragging-Committee.pdf"));
                startActivity(intent);
            }
        });
        important_links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.piet.co.in/placements/"));
                startActivity(intent);
            }
        });

        return view;
    }
}