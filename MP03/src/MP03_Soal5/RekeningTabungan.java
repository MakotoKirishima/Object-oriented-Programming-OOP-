/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal5;

/**
 *
 * @author Alose
 */
public class RekeningTabungan extends Rekening{
    public RekeningTabungan(String noRek, double saldoAwal){
        super(noRek, saldoAwal);
    }
    
    @Override
    public void tarik(double jumlah){
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus > 0");
            return;
        } else if (jumlah <= saldo) {
            System.out.println("Tarik sukses. Sisa saldo: " + saldo);
        } else{
            System.out.println("Saldo tidak mencukupi.");
        }
    }
}
