package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment{
    EditText edtFrag4;
    Button btnFrag4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_4,container,false);
        edtFrag4 = view.findViewById(R.id.edtFrag4);
        btnFrag4 = view.findViewById(R.id.btnFra4);
        //tham chiếu đến frag 3 -> màn hình chính -> thuộc tính frag3
        // Tổ chức khác cấp( qua cách lớp đi ra cha xong đi vào con )
        btnFrag4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText editText = getActivity().findViewById(R.id.edtFrag3);
                editText.setText(edtFrag4.getText().toString());
            }
        });
        return view;
    }
}
