package com.kleinpix.CreationalPatterns.Prototype;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Creational Design Patterns - Prototype Pattern
                WITH test cases.
*/

public class RunJobs
{
    public static void main(String[] args)
    {
        Technician tech1 = new Technician("Heinrich");
        System.out.println("1st Assigned Technician: " + tech1);

        Technician tech2 = (Technician) tech1.makeCopy();
        System.out.println("2nd Assigned Technician: " + tech2);

        TechTask techTask1 = new TechTask(53040054,"CCR Vandalized");
        System.out.println("1st Assigned Task: " + techTask1);
        TechTask techTask2 = (TechTask) techTask1.makeCopy();
        System.out.println("2nd Assigned Task: " + techTask2);
    }
}
