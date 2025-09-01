/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alose
 */

interface Printer {

    void print(String message);
}

class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

public class Puppynew {
    private String name;
    private int puppyAge;
    
    public Puppynew(String name){
        if (name==null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }
    
    public void setAge(int age){
        if (age < 0) {
            System.out.println("Age cannot be negative. No change made.");
            return;
        }
        this.puppyAge = age;
    }
    
    public int getAge(){
        return puppyAge;
    }
    
    public String getName(){
        return name;
    }
    
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        
        Puppynew mypuppy = new Puppynew("Tommy");
        
        printer.print("Name chosen is: " + mypuppy.getName());
        
        mypuppy.setAge(2);
        
        printer.print("Puppy's age is: " + mypuppy.getAge());
    }
}
