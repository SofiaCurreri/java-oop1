package org.lessons.java.shop;

public class Main {
    public static void main(String[] args){

        Product bag = new Product();
        bag.setName("Bag");
        bag.setDescription("an everyday leather bag");
        bag.setPrice(69.99);
        bag.setIva(0.19);

        System.out.println("The product is a " + bag.getName() + ", " + bag.getDescription() + " whose price is " + bag.getPrice() + " (iva: " + bag.getIva() + ")\n" + "Product code is " + bag.getCode() );
    }
}
