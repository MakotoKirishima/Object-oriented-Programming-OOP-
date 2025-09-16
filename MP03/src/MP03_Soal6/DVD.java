/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal6;

/**
 *
 * @author Alose
 */

public class DVD extends Item {
    public DVD(String judul, int tahun) { super(judul, tahun); }
    @Override public void tampilkanInfo() { System.out.println(judul + " (" + tahun + ") - DVD"); }
}