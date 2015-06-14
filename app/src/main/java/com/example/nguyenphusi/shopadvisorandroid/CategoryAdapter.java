package com.example.nguyenphusi.shopadvisorandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nguyenphusi.shopadvisorandroid.model.Category;

import java.util.ArrayList;

/**
 * Created by nguyenphusi on 6/14/15.
 */
public class CategoryAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
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
        View view;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            view = new View(context);

            // get layout from mobile.xml
            view = inflater.inflate(android.R.layout.simple_list_item_activated_1, null);

            // set value into textview
            TextView textView = (TextView) view
                    .findViewById(android.R.id.text1);
            Category category = categories.get(position);
            textView.setText(category.getName());

        } else {
            view = (View) convertView;
        }

        return view;
    }
}
