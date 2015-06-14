package com.example.nguyenphusi.shopadvisorandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.nguyenphusi.shopadvisorandroid.model.Product;

import java.util.ArrayList;

/**
 * Created by nguyenphusi on 6/14/15.
 */
public class ItemAdapter extends BaseAdapter {
    private Context context;
    //private String[] itemNames;
    private ArrayList<Product> products;

    public ItemAdapter(Context c, ArrayList<Product> products) {
        this.context = c;
        this.products  = products;
    }

    @Override
    public int getCount() {
        return this.products.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            Product product = products.get(position);
            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.grid_item, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(product.getName());

            TextView txtBrand = (TextView) gridView.findViewById(R.id.grid_item_brand);
            txtBrand.setText(product.getBrand());

            TextView txtPrice = (TextView) gridView.findViewById(R.id.grid_item_price);
            txtPrice.setText("$"+product.getPrice());

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            imageView.setImageResource(product.getImageSrc());

//            String itemName = itemNames[position];
//
//            if (mobile.equals("Windows")) {
//                imageView.setImageResource(R.drawable.windows_logo);
//            } else if (mobile.equals("iOS")) {
//                imageView.setImageResource(R.drawable.ios_logo);
//            } else if (mobile.equals("Blackberry")) {
//                imageView.setImageResource(R.drawable.blackberry_logo);
//            } else {
//                imageView.setImageResource(R.drawable.android_logo);
//            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }
}
