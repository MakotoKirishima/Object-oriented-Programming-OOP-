/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractInterface;

/**
 *
 * @author Alose
 */

class Rectangle extends Shape implements Drawable {

    double width;
    double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle " + width + " x " + height);
        System.out.println(" ______");
        System.out.println(" |    |");
        System.out.println(" |____|");
    }

    @Override
    public String toString() {
        return getName() + " (width=" + width + ", height=" + height + ")";
    }
}