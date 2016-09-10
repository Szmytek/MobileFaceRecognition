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
public class RecognizeFaceFragment extends Fragment {

    public static RecognizeFaceFragment newInstance() {
        RecognizeFaceFragment fragment = new RecognizeFaceFragment();
        return fragment;
    }

    public RecognizeFaceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recognizeface_fragment, container, false);

        return rootView;
    }
}
