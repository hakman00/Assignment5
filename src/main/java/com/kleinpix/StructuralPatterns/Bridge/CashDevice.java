package com.kleinpix.StructuralPatterns.Bridge;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Bridge Pattern
                WITH test cases.
*/

public abstract class CashDevice
{
    Totals totals;
    double currentCashFigures;

    //parameterized constructor
    //public CashDevice(Totals totals, double currentCashFigures)
    //{
    //    this.totals = totals;
     //   this.currentCashFigures = currentCashFigures;
    //}
    //Methods
    //Getters - Accesors
    public abstract void loadCash();

    public Totals getTotals()
    {
        return totals;
    }
    public double getCurrentCashFigures()
    {
        return currentCashFigures;
    }
    //Stters - Mutators
    public void setTotals(Totals totals)
    {
        this.totals = totals;
    }
    public void setCurrentCashFigures(double currentCashFigures)
    {
        this.currentCashFigures = currentCashFigures;
    }

    public void displayFigures(double loadedCashFigures)
    {
        double cashOnHand = currentCashFigures + loadedCashFigures;
        if((cashOnHand > 450000.00) && (cashOnHand < 700000.00))
        {
            System.out.println("The ATM des not need replenishment today. ");
        }
        else if((cashOnHand < 450000.00) && (cashOnHand >= 150000.00))
        {
            System.out.println("This ATM is due for replenishment. ");
        }
        else
        {
            System.out.println("The ATM needs replenishment to avoid cash-out! ");
        }
    }
}
