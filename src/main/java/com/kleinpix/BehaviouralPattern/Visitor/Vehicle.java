package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

public interface Vehicle
{
    public void accept(CarDealership client);
}
