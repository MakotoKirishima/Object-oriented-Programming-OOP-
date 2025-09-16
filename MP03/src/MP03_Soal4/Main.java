/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal4;

/**
 *
 * @author Alose
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        AlatElektronik ae;
        
        System.out.println("Masukkan pilihan anda (1 atau 2): ");
        int pilihan = scan.nextByte();
        
        if (pilihan == 1) {
            ae = new Televisi();
        } else if (pilihan == 2){
            ae = new Radio();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        System.out.println("Pilih aksi:");
        System.out.println("1. Nyalakan mesin");
        System.out.println("2. Matikan mesin");
        
        System.out.println("Masukkan pilihan aksi anda (1 atau 2): ");
        int aksi = scan.nextInt();
        
        if (aksi == 1) {
            ae.hidupkan();
        } else if (aksi == 2) {
            ae.matikan();
        } else {
            System.out.println("Aksi tidak valid.");
        }
    }
}
