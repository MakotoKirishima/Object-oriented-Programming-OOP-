/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author Alose
 */

class Publikasi{
    String namaPublikasi;
    String namaAuthor;
    
    public Publikasi(String namaPublikasi, String namaAuthor){
        this.namaPublikasi = namaPublikasi;
        this.namaAuthor = namaAuthor;
    }
    
    public void show(){
        System.out.println("Judul: " + namaPublikasi);
        System.out.println("Author: " + namaAuthor);
    }
}

class Buku extends Publikasi{
    public Buku(String judulBuku, String namaAuthor){
        super(judulBuku, namaAuthor);
    }
}

class Perpustakaan{
    private Buku buku1;
    private Buku buku2;
    
    public void setBukuPertama(Buku b){
        this.buku1 = b;
    }
    
    public void setBukuKedua(Buku b){
        this.buku2 = b;
    }
    
    public void showBooks(){
        buku1.show();
        System.out.println();
        buku2.show();
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pengantar Desain UI/UX", "Jubilee Enterprise");
        Buku b2 = new Buku("The Pragmatic Programmer", "Andrew Hunt and David Thomas");
    
        Perpustakaan perpus = new Perpustakaan();
        perpus.setBukuPertama(b1);
        perpus.setBukuKedua(b2);
        
        perpus.showBooks();
    }
}
