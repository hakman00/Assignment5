package com.kleinpix.BehaviouralPattern.ChainOfResponsibility;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - ChainOfResponsibility Pattern
                WITH test cases.
*/

public class Pig extends Animal
{
    public Pig(int level)
    {
        this.level = level;
    }
    @Override
    public void play(String sound)
    {
        System.out.println("All pigs - " + sound);
    }
}
