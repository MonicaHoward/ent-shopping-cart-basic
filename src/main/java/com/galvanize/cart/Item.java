package com.galvanize.cart;

public class Item {
    //properties
    String itemName;
    double itemPrice;

    //constructor
    public Item(String name, double itemPrice){
        this.itemName = name;
        this.itemPrice = itemPrice;
    }

    //methods
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
