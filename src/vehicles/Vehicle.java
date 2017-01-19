/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import flyingBehaviours.FlyingBehaviour;
import drivingBehaviours.DrivingBehaviourI; 

/**
 *
 * @author 1500825
 */
public class Vehicle implements FlyingBehaviour, DrivingBehaviourI{
    FlyingBehaviour flyingBehaviour; 
    DrivingBehaviourI drivingBehaviour; 
    
    @Override
    public void fly(){
        flyingBehaviour.fly(); 
    }
    
    @Override
    public void drive(){
        drivingBehaviour.drive(); 
    }
    
    public void setFlyingBehaviour(FlyingBehaviour fb){
        flyingBehaviour = fb; 
    }
}
