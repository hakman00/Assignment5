package com.kleinpix.StructuralPatterns.Proxy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Proxy Pattern
                WITH test cases.
*/

public abstract class Person
{
    public void warmlyGreets()
    {
        System.out.println(this.getClass().getSimpleName() + ": Goodday, hope you're well. Great Seeing you! " );
    }
}
