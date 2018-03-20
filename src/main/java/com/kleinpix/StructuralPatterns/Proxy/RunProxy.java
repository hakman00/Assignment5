package com.kleinpix.StructuralPatterns.Proxy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Proxy Pattern
                WITH test cases.
*/

public class RunProxy
{
    public static void main(String[] args)
    {
        Proxy proxy = new Proxy();

        CompanyCEO companyCEO = new CompanyCEO();
        companyCEO.warmlyGreets();

        proxy.warmlyGreets();
    }
}
