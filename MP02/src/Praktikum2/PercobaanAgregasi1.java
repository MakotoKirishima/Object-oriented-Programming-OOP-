/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author Alose
 */

class Vehicle{
    private String vin;
    
    public String getVin(){
        return vin;
    }
    
    public void setVin(String vin){
        this.vin = vin;
    }
}

class Speed{
    private double max;
    
    public double getMax(){
        return max;
    }
    
    public void setMax(double max){
        this.max = max;
    }
}

class Van extends Vehicle {

    private Speed speed;

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void print() {
        System.out.println("Vin: " + this.getVin() + ", Max Speed: " + speed.getMax());
    }
}

public class PercobaanAgregasi1 {
    public static void main(String[] args) {
        Speed speed = new Speed();
        Van van = new Van();
        speed.setMax(120);
        
        van.setVin("abcd1233");
        van.setSpeed(speed);
        van.print();
    }
}
