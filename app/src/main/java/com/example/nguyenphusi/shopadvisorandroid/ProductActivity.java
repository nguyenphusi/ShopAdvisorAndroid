package com.example.nguyenphusi.shopadvisorandroid;

import android.app.ActionBar;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nguyenphusi.shopadvisorandroid.model.Category;
import com.example.nguyenphusi.shopadvisorandroid.model.Product;


public class ProductActivity extends ActionBarActivity {

    Context context = this.context;
    TextView txtName, txtPrice, txtDes;
    ImageView imageProduct;

    Product product;
    Category category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        //SharedPreferences sharedPref = context.getSharedPreferences(Context.MODE_PRIVATE);
        SharedPreferences sharedPref = getSharedPreferences("shop", Context.MODE_PRIVATE);

        int selectedCategory = sharedPref.getInt(getString(R.string.selected_category), 9999);
        int selectedProduct = sharedPref.getInt(getString(R.string.selected_product),8888);

        category = Global.createSampleCategories().get(selectedCategory);
        product = category.getProducts().get(selectedProduct);

        txtName = (TextView) findViewById(R.id.product_name);
        txtDes = (TextView) findViewById(R.id.product_des);
        txtPrice = (TextView) findViewById(R.id.product_price);
        imageProduct = (ImageView) findViewById(R.id.product_image);

        txtName.setText(product.getName());
        txtPrice.setText("$"+product.getPrice());
        txtDes.setText(product.getDescription());
        imageProduct.setImageResource(product.getImageSrc());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Toast.makeText(this.getApplicationContext(), getString(R.string.selected_category)+":" + selectedCategory+"-"+getString(R.string.selected_product) + selectedProduct,
//                        Toast.LENGTH_SHORT).show();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_product, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == android.R.id.home){
            //NavUtils.navigateUpFromSameTask(this);
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
