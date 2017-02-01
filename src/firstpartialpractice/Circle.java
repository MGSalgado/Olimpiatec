/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialpractice;

/**
 *
 * @author alumno
 */
public class Circle {
    private double radius;
    
    public Circle(){
        this(1.0);
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(){
        this.radius=radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public double getCircumference(){
        return Math.PI*2*this.radius;
    }
    
    @Override
    public String toString(){
        return "Circle(radius="+this.radius+")";
    }
}
