/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal6;

/**
 *
 * @author Alose
 */
public abstract class Item {

    protected String judul;
    protected int tahun;

    public Item(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    public abstract void tampilkanInfo();
}