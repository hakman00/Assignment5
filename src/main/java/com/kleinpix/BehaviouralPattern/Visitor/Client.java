package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

public class Client implements CarDealership
{
    public void cust(SUV suv)
    {
        System.out.println("Display SUV... ");
    }
    public void cust(LuxurySedan sedan)
    {
        System.out.println("Display Luxsury Sedan... ");
    }
}
