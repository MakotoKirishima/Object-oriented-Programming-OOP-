/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author Alose
 */
public class PercobaanInheritance1 {

    /**
     * @param args the command line arguments
     */

    static class Employee{ //perlu ditambah static, agar dapat dibaca oleh main
        float salary=40000;
    }

    static class Programmer extends Employee{ //perlu ditambah static, agar dapat dibaca oleh main
        int bonus=10000;
        public static void main(String[] args) {
            Programmer p = new Programmer();
            System.out.println("Programmer salary is: " + p.salary);
            System.out.println("Bonus of Programmer is: " + p.bonus);
        }
    }
}
