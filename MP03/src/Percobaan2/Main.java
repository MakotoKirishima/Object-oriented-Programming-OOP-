/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percobaan2;

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
        
        Hewan[] hewanarray = new Hewan[4]; //update MP3 soal no.2
        hewanarray[0] = new Anjing();
        hewanarray[1] = new Kucing();
        hewanarray[2] = new Kucing();
        hewanarray[3] = new Burung(); //update MP3 soal no.2
        
        System.out.println("Masukkan pilihan Anda (0 hingga 3): "); //update MP3 soal no.2
        int pilihan = scan.nextInt();
       
        if (pilihan >= 0 && pilihan < hewanarray.length){
            hewanarray[pilihan].suara();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scan.close();
    }
}
