package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

public class LuxurySedan implements Vehicle
{
    private String sedanMake;
    private int numberOfDoors;

    //accept the visitor
    @Override
    public void accept(CarDealership client)
    {
        client.cust(this);
    }
    //parameterized construcotr
    public LuxurySedan(String sedanMake,int numberOfDoors)
    {
        this.sedanMake = sedanMake;
        this.numberOfDoors = numberOfDoors;
    }
    //methods
    //Getters - Accessors
    public String getSedanMake()
    {
        return sedanMake;
    }
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }
    //Setters
    public void setSedanMake(String sedanMake)
    {
        this.sedanMake = sedanMake;
    }
    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }
}
