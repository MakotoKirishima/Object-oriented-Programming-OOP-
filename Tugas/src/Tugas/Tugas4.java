/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;


/**
 *
 * @author Alose
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.Socket;

public class Tugas4 {

    public static void main(String[] args) {
        String file = "file.txt";

        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("Menghubungkan ke server...");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (Exception e) {
            System.out.println("Error saat menghubungkan ke server atau mengirimkan file: " + e.getMessage());
        }
    }
}