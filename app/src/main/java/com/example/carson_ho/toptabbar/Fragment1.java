package com.example.carson_ho.toptabbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class Fragment1 extends Fragment {
    View view;
    EditText edit;



    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, null);

        edit = (EditText) view.findViewById(R.id.edit);

        return view;
    }

        @Override

        public void onActivityCreated(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onActivityCreated(savedInstanceState);
            edit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    System.out.println("2222222222222222222222222222222222222222222222");
                    edit.setFocusable(true);
                    edit.setFocusableInTouchMode(true);
                    edit.setText(" ");
                }
            });
        }



}
