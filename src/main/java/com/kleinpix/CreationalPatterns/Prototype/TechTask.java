package com.kleinpix.CreationalPatterns.Prototype;

/*
   NAME     :   Heinrich Klein
   STUDENT# :   195032659
   DATE     :   16 March 2018
   DESCRIPT :   Demonstration of Creational Design Patterns - Prototype Pattern
                WITH test cases.
*/

public class TechTask implements Jobs
{
    private int taskNum;
    private String taskName;

    //parameterized constructor
    public TechTask(int taskNum, String taskName)
    {
        this.taskNum = taskNum;
        this.taskName = taskName;
    }
    //Methods
    //Getters - Accessors
    public int getTaskNum()
    {
        return taskNum;
    }
    public String getTaskName()
    {
        return taskName;
    }
    //Setters - Mutators
    public void setTaskNum(int taskNum)
    {
        this.taskNum = taskNum;
    }
    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    @Override
    public TechTask makeCopy()
    {
        return new TechTask(taskNum,taskName);
    }
}
