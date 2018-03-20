package com.kleinpix.BehaviouralPattern.Strategy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Strategy Pattern
                WITH test cases.
*/

public class ShoppingItem
{
    private double price;
    private String shopItemName;

    //parameterized constructor
    public ShoppingItem(double price, String shopItemName)
    {
        this.price = price;
        this.shopItemName = shopItemName;
    }
    //Methods
    //Getters - ACcessors
    public double getPrice()
    {
        return price;
    }
    public String getShopItemName()
    {
        return shopItemName;
    }
    //Setters - Mutators
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setShopItemName(String shopItemName)
    {
        this.shopItemName = shopItemName;
    }
}
