package com.kleinpix.StructuralPatterns.Proxy;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Structural Design Patterns - Proxy Pattern
                WITH test cases.
*/

import java.util.Date;

public class Proxy
{
    Janitor janitor;

    public Proxy()
    {
        System.out.println("Creating Proxy at: " + new Date());
    }

    public void warmlyGreets()
    {
        if(janitor == null)
        {
            janitor = new Janitor();
        }
        janitor.warmlyGreets();
    }
}
