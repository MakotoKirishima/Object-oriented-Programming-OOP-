/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alose
 */
public class Puppy {

    /**
     * @param args the command line arguments
     */
    int puppyAge;
    
    public Puppy (String name){
        System.out.println("Name chosen is: "+ name);
    }
    
    public void setAge(int age){
        puppyAge = age;
    }
    
    public int getAge(){
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }
    
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
        
        myPuppy.setAge(2);
        
        myPuppy.getAge();
        
        System.out.println("Variable Value: " + myPuppy.puppyAge);
    }
    
}