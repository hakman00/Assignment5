package com.kleinpix.StructuralPatterns.Bridge;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Bridge Pattern
                WITH test cases.
*/

public class RunReplenish
{
    public static void main(String[] args)
    {
        CashDevice cd1 = new DNR_Device(new ATM_Load());
        cd1.loadCash();
        cd1.setTotals(new DNR_Load());
        cd1.loadCash();

        cd1 = new ATM_Device(new ATM_Load());
        cd1.loadCash();
        cd1.setTotals(new DNR_Load());
        cd1.loadCash();
    }
}
