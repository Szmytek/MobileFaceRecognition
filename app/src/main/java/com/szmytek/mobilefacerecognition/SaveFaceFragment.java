package com.szmytek.mobilefacerecognition;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by Szmytek on 10.09.2016.
 */
public class SaveFaceFragment extends Fragment{

    public static SaveFaceFragment newInstance() {
        SaveFaceFragment fragment = new SaveFaceFragment();
        return fragment;
    }

    public SaveFaceFragment() {
    }

    Button ClickMe;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.saveface_fragment, container, false);
        View mainView = inflater.inflate(R.layout.activity_main, container, false);
        ClickMe = (Button) rootView.findViewById(R.id.button);
        tv = (TextView) rootView.findViewById(R.id.textView2);
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText().toString().contains("Hello")){
                    tv.setText("Hi");
                }else tv.setText("Hello");
            }
        });
        return rootView;
    }
}
