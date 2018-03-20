package com.kleinpix.StructuralPatterns.Bridge;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Bridge Pattern
                WITH test cases.
*/

public class ATM_Device extends CashDevice
{
    public ATM_Device(Totals totals)
    {
        this.totals = totals;
        this.currentCashFigures = currentCashFigures;
    }
    @Override
    public void loadCash()
    {
        System.out.println("The ATM has been loaded successfully. ");

        double loadedCashFigures = totals.load();
        displayFigures(currentCashFigures);
    }
}
