/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractInterface;

/**
 *
 * @author Alose
 */

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Rectangle rect1 = new Rectangle(4, 2);

        System.out.println(circle1.toString());
        System.out.println("Area = " + circle1.getArea());
        circle1.draw();
        System.out.println();

        System.out.println(rect1.toString());
        System.out.println("Area = " + rect1.getArea());
        rect1.draw();
        System.out.println();

        Circle circle2 = new Circle(-1);
        Rectangle rect2 = new Rectangle(5.5, 3.2);

        System.out.println(circle2.toString());
        System.out.println("Area = " + circle2.getArea());
        circle2.draw();
        System.out.println();

        System.out.println(rect2.toString());
        System.out.println("Area = " + rect2.getArea());
        rect2.draw();
    }
}