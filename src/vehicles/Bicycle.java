/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;
import drivingBehaviours.DriveOnRoad; 

/**
 *
 * @author 1500825
 */
public class Bicycle extends Vehicle{
    public Bicycle(){
        drivingBehaviour = new DriveOnRoad(); 
    }
}
