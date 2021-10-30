package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.adapter.ProductAdapter;
import com.example.model.Product;

import java.util.ArrayList;

public class FragmentProduct extends Fragment{
    ListView lvProduct;
    ArrayList<Product> products;
    ProductAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.productfragment, container, false);
        lvProduct = view.findViewById(R.id.lvProduct);
        adapter = new ProductAdapter(getContext(), R.layout.item_listview, initData());
        lvProduct.setAdapter(adapter);
        return view;

    }

    private ArrayList<Product> initData() {
        products = new ArrayList<>();
        products.add(new Product(R.drawable.beer333, "Beer", 19000, "Heinelen không chỉ là bia"));
        products.add(new Product(R.drawable.hanoi, "Beer", 19000, "HaNoi không chỉ là bia"));
        products.add(new Product(R.drawable.larue, "Beer", 19000, "Larue không chỉ là bia"));
        products.add(new Product(R.drawable.saigon, "Beer", 19000, "SaiGon không chỉ là bia"));
        return products;
    }


}




