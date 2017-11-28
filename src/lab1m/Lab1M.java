/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1m;

/**
 *
 * @author parad
 */

abstract class Figure{
    double x;
    double y;
    
    Figure(double a, double b) {
        x = a;
        y = b;
    }    
   
}


class Triangle extends Figure implements IA {
    Triangle(double a, double b) {
        super(a, b);
    }
    
    public double area() {
        return x * y / 2;
    }
}


public class Lab1M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(10, 8);

    Figure figure;
    figure = triangle;
    System.out.println("Площадь равна " + triangle.area());
        
    }
    
}
