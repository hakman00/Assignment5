package com.kleinpix.BehaviouralPattern.Visitor;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - Visitor Pattern
                WITH test cases.
*/

//concrete elemnt - concrete implementation of Vehicle interface
public class SUV implements Vehicle
{
    private String make;
    private int numberOfSeats;

    //accept the visitor
    @Override
    public void accept(CarDealership client)
    {
        client.cust(this);
    }

    //parameterized constructor
    public SUV(String make, int numberOfSeats)
    {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
    }
    //methods
    //Getters - Accessors
    public String getMake()
    {
        return make;
    }
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }
    //Setters - Mutators
    public void setMake(String make)
    {
        this.make = make;
    }
    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }
}
