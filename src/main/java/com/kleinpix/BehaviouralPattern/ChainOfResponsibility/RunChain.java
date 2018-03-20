package com.kleinpix.BehaviouralPattern.ChainOfResponsibility;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Behavioural Design Patterns - ChainOfResponsibility Pattern
                WITH test cases.
*/

public class RunChain
{
    private static Animal getChainOfAnimals()
    {
        Animal dog = new Dog(Animal.bark);
        Animal pig = new Pig(Animal.oink);
        Animal wolf = new Wolf(Animal.howl);

        //dog.setNextAnimal(pig);
        //pig.setNextAnimal(wolf);

        return dog;
    }

    public static void main(String[] args)
    {
        Animal chain = getChainOfAnimals();
        chain.makeSound(Animal.bark,"BARK ");
        chain.makeSound(Animal.oink,"OINK ");
        chain.makeSound(Animal.howl,"HOWLS");
    }


}
