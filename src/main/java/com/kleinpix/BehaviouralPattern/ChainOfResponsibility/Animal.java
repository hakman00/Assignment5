package com.kleinpix.BehaviouralPattern.ChainOfResponsibility;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - ChainOfResponsibility Pattern
                WITH test cases.
*/

//create an abstarct class
public abstract class Animal
{
    public static int bark = 1;
    public static int oink = 2;
    public static int howl = 3;

    protected int level;

    //next element in chain or responsible
    private Animal nextAnimal;

    public void setNextAnimal(Animal nextAnimal)
    {
        this.nextAnimal = nextAnimal;
    }
    public void makeSound(int level,String sound)
    {
        if(this.level <= level)
        {
            play(sound);
        }
        if(nextAnimal != null)
        {
            nextAnimal.makeSound(level,sound);
        }
    }
    abstract protected void play(String sound);
}
