package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

import java.util.ArrayList;

public class RunVisitor
{
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new SUV("Mercedes ML",7);
        Vehicle vehicle2 = new SUV("Mecedes GLC",5);
        Vehicle vehicle3 = new LuxurySedan("Merceds AMG45",5);
        Vehicle vehicle4 = new LuxurySedan("Mecedes SLK",2);
        vehicle1.accept(new Client());
        vehicle2.accept(new Client());
        vehicle3.accept(new Client());
        vehicle4.accept(new Client());
    }
}
    /*
    //private ArrayList<Vehicle> vehicles;
    public static void main(String[] args)
    {
        Vehicle [] vehicles = new Vehicle[]{new SUV("Mercedes ML",7),new SUV ("Mecedes GLC",5),
        new LuxurySedan("Merceds AMG45",5),new LuxurySedan("Mecedes SLK",2)};


        //double total = reserve(vehicles);

        System.out.println();

        private static double reserve(CarDealership client)
        {
            CarDealership client = new Client();
        }

    }
    */
//}
