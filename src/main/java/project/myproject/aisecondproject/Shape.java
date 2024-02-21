/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.myproject.aisecondproject;

/**
 *
 * @author Lenovo
 */
public class Shape 
{
    
    double x;
    double y;
    String type;
    
    
    public Shape()
    {
        type=new String();
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    
    public void setY(double y)
    {
        this.y=y;
    }
    
    public void setType(String type)
    {
        this.type=type;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public String getType()
    {
        return type;
    }
    
}

