package org.lessons.java.shop;

import java.util.Random;
public class Product {
    //ATTRIBUTI
    private final int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    Random random = new Random();

    //COSTRUTTORE
    public Product(String name, String description, double price, double iva) {
        this.code = random.nextInt(10000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    //GETTER
    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public String getIva(){
        return this.iva * 100 + "%";
    }

    //SETTER
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIva(double iva){
        this.iva = iva * 100;
    }

    //METHODS
    public double priceWithoutIva(){
        return this.price;
    }

    public double pricePlusIva(){
        return this.price + (this.price * this.iva);
    }

    public String extendedName(){
        return this.code + "-" + this.name;
    }
}
