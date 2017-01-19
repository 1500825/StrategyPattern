/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import vehicles.Plane;
import vehicles.Vehicle;
import vehicles.Chopper;
import vehicles.Car;
import vehicles.Bicycle;

/**
 *
 * @author 1500825
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle firstPlane =  new Plane(); 
        System.out.println("Plane: ");
        firstPlane.fly(); 
        firstPlane.drive(); 
        
        System.out.println("Chopper");
        Vehicle firstHelicopter = new Chopper(); 
        firstHelicopter.fly(); 
        
        System.out.println("Car: ");
        Vehicle firstCar = new Car(); 
        firstCar.drive();
        
        System.out.println("Bicycle: ");
        Vehicle firstBicycle = new Bicycle(); 
        firstBicycle.drive();
    }
    
}
