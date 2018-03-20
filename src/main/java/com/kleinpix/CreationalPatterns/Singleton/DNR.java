package com.kleinpix.CreationalPatterns.Singleton;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Creational Design Patterns - Singleton Pattern
                WITH test cases.
*/

public class DNR
{
    public static DNR dnr = null;

    //private constructor to prevent class instantiation from outside classes
    private DNR()
    {

    }
    public static DNR getInstance()
    {
        if(dnr == null)
        {
            dnr = new DNR();
        }
            return dnr;
    }
    public void nameDevice()
    {
        System.out.println("Capitec Bank DNR Terminal ");
    }
}
