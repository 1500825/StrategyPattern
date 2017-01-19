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
public class Plane extends Vehicle{
    public Plane(){
        flyingBehaviour = new FlyWithWings();
//        drivingBehaviour = new DriveOnRunway();
    }
}
