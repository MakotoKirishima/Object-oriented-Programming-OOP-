/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author Alose
 */
class Vehicle {
    Vehicle() {
        System.out.println("Ini Kendaraan");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Ini mobil");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("Ini kendaraan Bus");
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        Car obj1 = new Car(); 
        Bus obj2 = new Bus(); 
    }
}
