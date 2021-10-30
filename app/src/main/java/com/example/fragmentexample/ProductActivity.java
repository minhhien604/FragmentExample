package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ProductActivity extends AppCompatActivity{
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        // Nhúng product fragment vào
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        // đổi ds sp thành màn hình chi tiet
        transaction.replace(R.id.layoutConteiner,new ProductFragment());// khởi tạo đối tượng trong class
       transaction.commit();
    }
}