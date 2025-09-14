/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractInterface;

/**
 *
 * @author Alose
 */

class Circle extends Shape implements Drawable {

    double radius;
    static final double PI = 3.14;

    Circle(double radius) {
        super("Circle");
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
        System.out.println(" (o)");
    }

    @Override
    public String toString() {
        return getName() + " (radius=" + radius + ")";
    }
}