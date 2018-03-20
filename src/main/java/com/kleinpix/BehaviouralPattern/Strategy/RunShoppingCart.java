package com.kleinpix.BehaviouralPattern.Strategy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Strategy Pattern
                WITH test cases.
*/

public class RunShoppingCart
{
    public static void main(String[] args)
    {
        ShoppingCart trolley = new ShoppingCart();

        ShoppingItem item1 = new ShoppingItem(69.99,"Lindt Chocolate");
        ShoppingItem item2 = new ShoppingItem(145.00,"Sirlion Steak");
        ShoppingItem item3 = new ShoppingItem(799.99,"Johnny Walker Gold Label");
        ShoppingItem item4 = new ShoppingItem(15.00,"Ice");

        trolley.addShoppingItem(item1);
        trolley.addShoppingItem(item2);
        trolley.addShoppingItem(item3);
        trolley.addShoppingItem(item4);

        //method to call the cash payment option / strategy
        trolley.pay(new CashPayment("Cash Payment"));

        //method to call the credit card payment option / strategy
        trolley.pay(new CreditCardPayment("HA Klein","0000-1111-2222-3333-4444"));
    }
}
