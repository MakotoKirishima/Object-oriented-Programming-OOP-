/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal5;

/**
 *
 * @author Alose
 */
public abstract class Rekening {
    protected String noRek;
    protected double saldo;
    
    public Rekening(String noRek, double saldoAwal){
        this.noRek = noRek;
        this.saldo = saldoAwal;
    }
    
    public void setor(double jumlah){
        if (jumlah < 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil. Saldo: " + saldo);
        } else {
            System.out.println("Jumlah setor haris > 0");
        }
    }
    public abstract void tarik(double jumlah);
    public String info(){
        return noRek + " | Saldo: " + saldo;
    }
}