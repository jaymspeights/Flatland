/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay Speights
 */
public class Entity {
    CoordinatePair loc;
    RigidBody rigid_body;
    
    
    public Entity(){
        
    }
    
    public void setRigidBody(RigidBody r){
        rigid_body = r;
    }
    
    public CoordinatePair getLoc(){
        return loc;
    }
}
