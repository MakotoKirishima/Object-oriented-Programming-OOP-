/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstractInterface;

/**
 *
 * @author Alose
 */

abstract class Shape {

    String name;
    
    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract double getArea();
}
