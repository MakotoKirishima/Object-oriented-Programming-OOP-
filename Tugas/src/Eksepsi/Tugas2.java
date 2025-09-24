/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eksepsi;

/**
 *
 * @author Alose
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tugas2 {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int angka = Integer.parseInt(line); // Perbandingan dengan metode BufferedWriter baru
            System.out.println("Hasil: " + (10 / angka));
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan: File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}
