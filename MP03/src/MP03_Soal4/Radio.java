/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP03_Soal4;

/**
 *
 * @author Alose
 */
public class Radio implements AlatElektronik{
    @Override
    public void hidupkan() {
        System.out.println("Radio hidup");
    }

    @Override
    public void matikan() {
        System.out.println("Radio mati");
    }
}
