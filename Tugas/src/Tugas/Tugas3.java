/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Alose
 */
public class Tugas3 {

    public static void main(String[] args) {
        try {
            File file = new File("E://file.txt");

            URL url = new URL("https://sample.com/upload/" + file);

            try {
                System.out.println("File berhasil diupload: " + file);
                System.out.println("responseBody");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Koneksi berkendala");
            System.out.println(e.getMessage());
        }
    }

    private static String bacaRespond(HttpURLConnection connection) throws IOException {
        return connection.getResponseMessage();
    }
}
