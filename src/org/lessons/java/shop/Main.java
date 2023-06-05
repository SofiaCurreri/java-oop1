package org.lessons.java.shop;

public class Main {
    public static void main(String[] args){

        Product bag = new Product("Bag", "an everyday leather bag", 69.99, 0.19);

        System.out.println("Product: " + bag.getName() + "\nDescription: " + bag.getDescription() + "\nProduct price: " +
                bag.priceWithoutIva() + "\nIva: " + bag.getIva() + "\nPrice + Iva: " + bag.pricePlusIva() +
                "\nProduct code: " + bag.getCode() + "\nExtended product name: " + bag.extendedName() );
    }
}
