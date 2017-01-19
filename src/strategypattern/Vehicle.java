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
public class Vehicle implements FlyingBehaviour{
    FlyingBehaviour flyingBehaviour; 
    
    @Override
    public void fly(){
        flyingBehaviour.fly(); 
    }
    
    public void setFlyingBehaviour(FlyingBehaviour fb){
        flyingBehaviour = fb; 
    }
}
