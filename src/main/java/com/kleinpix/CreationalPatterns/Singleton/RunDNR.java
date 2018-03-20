package com.kleinpix.CreationalPatterns.Singleton;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Creational Design Patterns - Singleton Pattern
                WITH test cases.
*/

public class RunDNR
{
    public static void main(String[] args)
    {
        DNR dnr = DNR.getInstance();

        dnr.nameDevice();
    }
}
