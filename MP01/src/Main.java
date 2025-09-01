/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alose
 */
public class Main {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    
    public static void main(String[] args) {
        myStaticMethod();
        
        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}
