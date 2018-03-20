package com.kleinpix.CreationalPatterns.Prototype;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Creational Design Patterns - Prototype Pattern
                WITH test cases.
*/

public class Technician implements Jobs
{
    private String name;

    public Technician(String name)
    {
        this.name = name;
    }
    //Methods
    //Getters - Accessors
    public String getName()
    {
        return name;
    }
    //Setters - Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public Jobs makeCopy()
    {
        return new Technician(name);
    }
    public String toString()
    {
        return "Technician Name: " + name;
    }

}
