package com.kleinpix.BehaviouralPattern.Strategy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Strategy Pattern
                WITH test cases.
*/

public class CashPayment implements MakePayment
{
    private String cash;

    public CashPayment(String cash)
    {
        this.cash = cash;
    }
    @Override
    public void pay(double amount)
    {
        System.out.println(": R " + amount + " Paid using cash tender. ");
    }
}
