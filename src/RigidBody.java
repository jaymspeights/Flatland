/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay Speights
 */
public class RigidBody {
    CoordinatePair[] vertex;
    boolean bound[];
    double[] vector;
    CoordinatePair loc;
    
    public RigidBody(CoordinatePair[] vertex) {
        this.vertex = vertex;
        vectorize();
    }
    
    public void vectorize(){
        vector = new double[vertex.length];
        bound = new boolean[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[(i+1)%vertex.length].getX() > vertex[i].getX())
                bound[i] = true;
            else if (vertex[(i+1)%vertex.length].getX() < vertex[i].getX())
                bound[i] = false;
            else { 
                bound[i] = false;
                vector[i] = Double.POSITIVE_INFINITY;
                continue;
            }
            vector[i] = (vertex[(i+1)%vertex.length].getY() - vertex[i].getY())/
                    (vertex[(i+1)%vertex.length].getX() - vertex[i].getX());           
        }
    }
    
    public void bind(Entity e) {
        this.loc = e.getLoc();
        e.setRigidBody(this);
    }
}
