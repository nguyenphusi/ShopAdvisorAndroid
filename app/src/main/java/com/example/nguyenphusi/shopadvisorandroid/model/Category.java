package com.example.nguyenphusi.shopadvisorandroid.model;

import java.util.ArrayList;

/**
 * Created by nguyenphusi on 6/14/15.
 */
public class Category {
    private int id;
    private String name;
    private ArrayList<Product> products;

    public Category() {
    }

    public Category(int id, String name, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
