package com.example.digicollage.Student_Activity_Nav_Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.digicollage.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Student_Nav_Leave_Application extends Fragment {
    EditText email_content;
    Button apply_leave;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment__student__nav__leave__application, container, false);
        email_content=view.findViewById(R.id.email_Content);
        apply_leave=view.findViewById(R.id.Apply_Leave);


        apply_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer stringBuffer1=new StringBuffer();
                CharSequence body =email_content.getText();
                Bundle bundle=getArguments();
                String userId=bundle.getString("userId");
                stringBuffer1.append(body);
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+"pietadminstration@gmail.com"+"?subject="+Uri.encode("Leave Application")+"&body="+
                        Uri.encode((stringBuffer1.toString()+
                                "My College Id:" +
                                userId))));
                //startActivity(Intent.createChooser(intent,"choose One app"));
                startActivity(intent);

            }
        });

        return view;
    }
}