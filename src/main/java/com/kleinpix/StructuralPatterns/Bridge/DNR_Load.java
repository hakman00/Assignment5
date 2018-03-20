package com.kleinpix.StructuralPatterns.Bridge;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Bridge Pattern
                WITH test cases.
*/

public class DNR_Load implements Totals
{
    double totals;

    public DNR_Load()
    {
        totals = 650000.00;
    }
    @Override
    public double load()
    {
        System.out.println("DNR replenished to: R650 000-00. ");
        return totals;
    }
}
