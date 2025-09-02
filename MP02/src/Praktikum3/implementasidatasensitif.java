/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author Alose
 */
public class implementasidatasensitif {

    private String accountNumber;
    private double balance;

    public implementasidatasensitif(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public static void main(String[] args) {
        implementasidatasensitif acc = new implementasidatasensitif("ACC12345", 5000.0);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        acc.setBalance(7500.0);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}
