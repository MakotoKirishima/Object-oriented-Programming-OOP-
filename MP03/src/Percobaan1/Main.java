/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author Alose
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.println("Masukkan pilihan Anda (1 atau 2): ");
        int pilihan = scan.nextInt();
        
        Hewan hewan;
        
        if (pilihan == 1) {
            hewan = new Anjing();
        } else if (pilihan == 2){
            hewan = new Kucing();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        hewan.suara();
        
        scan.close();
    }
}
