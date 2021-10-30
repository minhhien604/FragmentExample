package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity{
    Button btnFrag1 , btnFrag2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linkViews();
        addEvents();


    }

    private void addEvents() {
//        btnFrag1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Fragment1 fragment1 = new Fragment1();
//                fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.add(R.id.layoutConteiner,fragment1);
//                fragmentTransaction.commit();
//
//            }
//        });
//        btnFrag2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Fragment2 fragment2 = new Fragment2();
//                fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.add(R.id.layoutConteiner,fragment2);
//                fragmentTransaction.commit();
//            }
//        });
        btnFrag1.setOnClickListener(myClick);
        btnFrag2.setOnClickListener(myClick);

    }
    // add frag1 rồi chưa xóa frag1 nên ko add frag2 được
    View.OnClickListener myClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment = null;
            if(view.getId()== R.id.btnFrag1){
                fragment = new Fragment1();

            }else if(view.getId()==R.id.btnFrag2) {
                fragment = new Fragment2();
                // đính kèm data
                Bundle bundle = new Bundle();
                bundle.putString("say","Hello");
               fragment.setArguments(bundle);
            }
            if (fragment != null){
                fragmentTransaction.replace(R.id.layoutConteiner,fragment);
                fragmentTransaction.commit();
            }

        }
    };

    private void linkViews() {
        btnFrag1 = findViewById(R.id.btnFrag1);
        btnFrag2 = findViewById(R.id.btnFrag2);
    }
}