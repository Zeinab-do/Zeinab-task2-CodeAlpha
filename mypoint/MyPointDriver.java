/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mypoint;

/**
 *
 * @author LENOVO
 */
public class MyPointDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint p1 = new MyPoint();//0,0
        MyPoint p2 = new MyPoint(1,5);//(1,5)
        
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(p2.getX(), p2.getY()));
        System.out.println(p1.distance(2,9));
        
    }
    
}
  