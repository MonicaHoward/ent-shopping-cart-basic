package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {
    //properties
    ArrayList<Item> itemsInCart = new ArrayList<Item>();

    //no constructor since we want cart to initialize as EMPTY

    // methods [ getTotalPrice() - itemizedList() - getTotalPrice() - itemQuantities() - onSaleItems() ]

    public void AddItem(Item item){
        itemsInCart.add(item);
    }

    public void AddItem(Item item, int quantity){

    }

    public void getTotalPrice(){

    }

    public void itemizedList(){

    }


    public void itemQuantities(){

    }

    public void onSaleItems(){

    }
}
