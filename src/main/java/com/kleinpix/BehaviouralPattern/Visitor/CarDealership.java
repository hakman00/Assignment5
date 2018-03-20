package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

public interface CarDealership
{
    //For each different type of concrete element, need to add a visit method.
    //visit other concrete items
    //double cust(SUV suv);
    //double cust(LuxurySedan sedan);
    public void cust(SUV suv);
    public void cust(LuxurySedan sedan);
}
