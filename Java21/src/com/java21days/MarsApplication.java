package com.java21days;

class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        System.out.println("#### Mars Robot: Spirit ####");
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        
        System.out.println("#### New Mars Robot: Opportunity ####");
        
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "exploring";
        opportunity.speed = 2;
        opportunity.temperature = -60;
        
        opportunity.showAttributes();
        System.out.println("Increasing speed to 3.");
        opportunity.speed = 3;
        opportunity.showAttributes();
        System.out.println("Changing temperature to -90.");
        opportunity.temperature = -90;
        opportunity.showAttributes();
        System.out.println("Checking the temperature.");
        opportunity.checkTemperature();
        opportunity.showAttributes();
    }
}
