/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.myproject.aisecondproject;

/**
 *
 * @author Lenovo
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;





public class extendedPanel extends javax.swing.JPanel {

    public Shape shape;
    public ArrayList<Shape> shapes;
    public ArrayList<Point> Lines;
    
    
    public extendedPanel() 
    {
        initComponents();
        shapes=new ArrayList<Shape>();
        Lines=new ArrayList <Point>();
    }
    
    
    public void clear() 
    {
        shapes.clear();
        Lines.clear();
        repaint();
    }
    
    public void clearLines(){
    Lines.clear();
    repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


     public void draw(Shape shape) 
    {
        this.shape=new Shape();
        this.shape.setX(shape.getX());
        this.shape.setY(shape.getY());
        this.shape.setType(shape.getType());
        shapes.add(this.shape);
        repaint();
    }

     
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        // Draw shapes
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shape.type.equals("triangle")) {
                g2.setColor(Color.blue);
                int[] xPoints = {(int) shape.x, (int) shape.x + 20, (int) shape.x + 10};
                int[] yPoints = {(int) shape.y, (int) shape.y, (int) shape.y + 20};
                g2.fillPolygon(xPoints, yPoints, 3);
            } else if (shape.type.equals("square")) {
                g2.setColor(Color.red);
                g2.fillRect((int) shape.x, (int) shape.y, 20, 20);
            }
            else if(shape.type.equals("testPoint"))
            {
                g2.setColor(Color.black);
                g2.fillOval((int)shapes.get(i).x,(int)shapes.get(i).y,10,10);
            }
        }

        // Draw lines
        g2.setColor(Color.black); // Choose a color for the lines
        for (int i = 0; i < Lines.size(); i += 2) 
        {
            Point p1 = Lines.get(i);
            Point p2 = Lines.get(i + 1);
            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Lines.add(p1);
        Lines.add(p2);
        repaint();
    }     
}

