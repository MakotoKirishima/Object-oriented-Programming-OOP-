/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal5;

/**
 *
 * @author Alose
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rekening r1 = new RekeningTabungan("TAB001", 1000000);
        Rekening r2 = new RekeningGiro("GIR001", 500000);
        Rekening r3 = new RekeningDeposito("DEP001", 2000000, false);

        System.out.println("Operasi:");
        
        r1.setor(200000);
        r1.tarik(500000);

        r2.tarik(900000);
        r3.tarik(1000000);
    }
}
