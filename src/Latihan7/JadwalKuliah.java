/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan7;

import java.util.Scanner;

/**
 *
 * @author lulurifqiaa
 */
public class JadwalKuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Hari;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Hari: ");
        Hari = scan.nextLine();
        switch(Hari){
            case "Selasa":
                System.out.println("Bahasa Inggris, Pengolahan Citra Digtal, Bahasa Indonesia");
                break;
            case "Rabu":
                System.out.println("Pemrograman Basis Data");
                break;
            case "Jumat":
                System.out.println("Praktikum Pemrograman Berorientasi Objek, Praktikum Pengolahan Citra Digital");
                break;
            case "Sabtu":
                System.out.println("Rekayasa Perangkat Lunak, Pemrograman Berorientasi Objek, Praktikum Pemrograman Basis Data");
                break;
            default:
                System.out.println("Tidak Ada Jadwal Kuliah!");
        }
    }
}
