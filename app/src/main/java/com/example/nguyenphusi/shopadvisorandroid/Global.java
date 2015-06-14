package com.example.nguyenphusi.shopadvisorandroid;

import android.app.Application;

import com.example.nguyenphusi.shopadvisorandroid.model.Category;
import com.example.nguyenphusi.shopadvisorandroid.model.Product;

import java.util.ArrayList;

/**
 * Created by nguyenphusi on 6/14/15.
 */
public class Global extends Application {


    private ArrayList<Category> categories;

    private Global(){
        this.categories = createSampleCategories();
    };

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }



    public static ArrayList<Product> createSampleProducts(int type){
        ArrayList<Product> products = new ArrayList<Product>();
        Product product;
        switch(type){
            case 0:
                product = new Product(1, "Blue Shirt", "Viettien", 200, R.drawable.shirt_blue, "High quality shirt!", "XL");
                products.add(product);
                product = new Product(2, "Dark Blue Shirt", "Viettien", 100, R.drawable.shirt_blue_2, "Beautiful shirt!", "XL");
                products.add(product);
                product = new Product(3, "Black Shirt", "N.L", 110, R.drawable.shirt_black, "Beautiful shirt!", "XL");
                products.add(product);
                product = new Product(4, "White Shirt", "N.L", 140, R.drawable.shirt_white, "High quality shirt!", "XL");
                products.add(product);
                product = new Product(5, "Gray Shirt", "N.L", 150, R.drawable.shirt_gray, "Beautiful shirt!", "XL");
                products.add(product);
                product = new Product(6, "Red Shirt", "Viettien", 210, R.drawable.shirt_red, "High quality shirt!", "XL");
                products.add(product);
                break;
            case 1:
                product = new Product(7, "Brown Pant", "Viettien", 200, R.drawable.pant1, "High quality pant!", "XL");
                products.add(product);
                product = new Product(8, "Black Pant", "N.L", 219, R.drawable.pant2, "Beautiful pant!", "XL");
                products.add(product);
                product = new Product(9, "Light Brown Pant", "Viettien", 229, R.drawable.pant3, "Beautiful pant!", "XL");
                products.add(product);
                product = new Product(10, "Gray Pant", "Viettien", 399, R.drawable.pant4, "High quality pant!", "XL");
                products.add(product);
                product = new Product(11, "Dark Brown Pant", "N.L", 150, R.drawable.pant5, "High quality pant!", "XL");
                products.add(product);
                product = new Product(12, "Yellow Pant", "N.L", 50, R.drawable.pant6, "Beautiful", "XL");
                products.add(product);
                break;
            case 2:
                product = new Product(13, "Red Hat", "Melin", 50, R.drawable.hat1, "Beautiful hat!", "XL");
                products.add(product);
                product = new Product(14, "Light Brown Hat", "Diamond", 40, R.drawable.hat2, "Cheap hat!", "XL");
                products.add(product);
                product = new Product(15, "Gray Brown Hat", "Diamond", 60, R.drawable.hat3, "High quality hat!", "XL");
                products.add(product);
                product = new Product(16, "Dark Brown Hat", "Melin", 45, R.drawable.hat4, "High quality hat!", "XL");
                products.add(product);
                product = new Product(17, "Fedora", "Son", 53, R.drawable.hat5, "High quality hat!", "XL");
                products.add(product);
                product = new Product(18, "Charlie's Hat", "Charlie", 999, R.drawable.hat6, "Charlie Chaplin's hat", "XL");
                products.add(product);
                break;
            default:
                break;
        }

        return products;
    }

    public static ArrayList<Category> createSampleCategories(){
        ArrayList<Category> categories = new ArrayList<Category>();
        Category category;

        category = new Category(1,"Shirt",createSampleProducts(0));
        categories.add(category);
        category = new Category(2,"Pant",createSampleProducts(1));
        categories.add(category);
        category = new Category(3,"Hat",createSampleProducts(2));
        categories.add(category);


        return categories;
    }
}
