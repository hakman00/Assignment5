package com.kleinpix.BehaviouralPattern.Strategy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Strategy Pattern
                WITH test cases.
*/

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    //create array to store list of shopping items
    List<ShoppingItem> items;
    //method to invoke arraylist constructor to store items in an arraylist
    public ShoppingCart()
    {
        this.items = new ArrayList<ShoppingItem>();
    }
    //method to add shoppingitem/s into arrayllist
    public void addShoppingItem(ShoppingItem shoppingItem)
    {
        this.items.add(shoppingItem);
    }
    //method to remove shopping item/s
    public void removeSoppingItem(ShoppingItem shoppingItem)
    {
        this.items.remove(shoppingItem);
    }
    //method to calculate total of all items
    public double calcTotal()
    {
        double sum = 0;
        //for a standard loop using array indexes i'll use the (int x=1;x<myArray.length;x==)
        //however, this is an enhanced for loop, for each String in my ShoppingItem array
        for(ShoppingItem shoppingItem : items)
        {
            sum += shoppingItem.getPrice();
        }
        return sum;
    }
    public void pay(MakePayment paymentType)
    {
        double amount = calcTotal();
        paymentType.pay(amount);
    }
}
