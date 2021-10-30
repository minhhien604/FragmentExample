package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragmentexample.R;
import com.example.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter{
    // content , layout , nguồn dữ liệu
    Context context;
    int item_layout;
    ArrayList<Product> products;

    public ProductAdapter(Context context, int item_layout, ArrayList<Product> products) {
        this.context = context;
        this.item_layout = item_layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(item_layout, null);
            holder.imvThumb = view.findViewById(R.id.imvThumb);
            holder.txtName = view.findViewById(R.id.txtName);
            holder.txtPrice = view.findViewById(R.id.txtPrice);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Product p = products.get(i);
        holder.imvThumb.setImageResource(p.getProductThumb());
        holder.txtName.setText(p.getProductName());
        holder.txtPrice.setText(String.valueOf(p.getProductPrice()));

            return view;
        }
        private static class ViewHolder{
            ImageView imvThumb;
            TextView txtName,txtPrice;
        }
    }

