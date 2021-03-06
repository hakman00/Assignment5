package com.kleinpix.BehaviouralPattern.Strategy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Strategy Pattern
                WITH test cases.
*/

public class CreditCardPayment implements MakePayment
{
    private String cardHolderName;
    private String cardNumber;

    //parameterized constructor
    public CreditCardPayment(String cardHolderName, String cardNumber)
    {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount)
    {
        System.out.println(": R " + amount + " Paid using card facility. ");
    }
}
