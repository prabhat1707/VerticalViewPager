package com.example.sample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    String text;
    private static final String TEXT = "text";
    private TextView ivTextView;

    public MyFragment() {
        // Required empty public constructor
    }


    public static MyFragment newInstance(String data) {
        MyFragment fragment = new MyFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString(TEXT, data);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.text = getArguments().getString(TEXT);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        ivTextView = view.findViewById(R.id.ivTextView);
        ivTextView.setText(text);
        return view;
    }

}
