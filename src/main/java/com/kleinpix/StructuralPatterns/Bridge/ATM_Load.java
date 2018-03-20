package com.kleinpix.StructuralPatterns.Bridge;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Bridge Pattern
                WITH test cases.
*/

public class ATM_Load implements Totals
{
    double totals;

    public ATM_Load()
    {
        totals = 580000.00;
    }
    @Override
    public double load()
    {
        System.out.println("ATM replenished to R580 000-00: ");
        return totals;
    }
}
