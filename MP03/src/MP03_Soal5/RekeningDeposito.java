/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal5;

/**
 *
 * @author Alose
 */
public class RekeningDeposito extends Rekening{
    private boolean jatuhTempo;
    public RekeningDeposito(String noRek, double saldoAwal, boolean jatuhTempo){
        super(noRek, saldoAwal);
        this.jatuhTempo = jatuhTempo;
    }
    
    @Override
    public void tarik(double jumlah){
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus > 0");
        }
        if (!jatuhTempo) {
            double pinalty = jumlah * 0.02;
            if (jumlah + pinalty <= saldo) {
                saldo -= (jumlah + pinalty);
                System.out.println("Penarikan sukses dengan penalti " + pinalty + ". Sisa saldo: " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi untuk penalti.");
            }
        } else {
            if (jumlah <= saldo) {
                saldo -= jumlah;
                System.out.println("Tarik sukses. Sisa saldo: " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi.");
            }
        }
    }
}
