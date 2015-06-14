package com.example.nguyenphusi.shopadvisorandroid.model;

/**
 * Created by nguyenphusi on 6/14/15.
 */
public class Product {
    private int id;
    private String name;
    private String brand;
    private int price;
    private int imageSrc;
    private String description;
    private String size;


    public Product() {
    }

    public Product(int id, String name, String brand, int price, int imageSrc, String description, String size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imageSrc = imageSrc;
        this.description = description;
        this.size = size;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
