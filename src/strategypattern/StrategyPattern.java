/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

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
        
        System.out.println("Chopper");
        Vehicle firstHelicopter = new Chopper(); 
        firstHelicopter.fly(); 
    }
    
}
