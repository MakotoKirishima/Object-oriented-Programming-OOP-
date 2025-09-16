/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal6;

/**
 *
 * @author Alose
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> koleksi = new ArrayList<>();
        koleksi.add(new Buku("Contoh Buku", 2020));
        koleksi.add(new Majalah("Contoh Majalah", 2021));
        koleksi.add(new DVD("Contoh DVD", 2019));
        for (Item it : koleksi) it.tampilkanInfo();
    }
}