package com.example.fragmentexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment{
    EditText edtFrag3;
    Button btnFrag3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_3,container,false);
        edtFrag3 = view.findViewById(R.id.edtFrag3);
        btnFrag3 = view.findViewById(R.id.btnFra3);
        btnFrag3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText edtContent = getActivity().findViewById(R.id.edtContent);
                edtContent.setText(edtFrag3.getText().toString());
            }
        });
        return view;
    }
    public void setContent(String s){
        edtFrag3.setText(s);

    }
}
