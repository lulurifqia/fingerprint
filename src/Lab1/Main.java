/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author lulurifqiaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println("*");
        }
        System.out.println("");
        int angka [] = {3, 1, 43, 24, 12};
        for (int x : angka){
            System.out.print(x + " ");
        }
        
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        while (running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [Ya/Tidak]");
            jawab = scan.nextLine();
            if (jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter ++;
        }
        System.out.println("Anda melakukan perulangan sebanyak" + counter + "Kali");
        
        int k=0;
        while (k<9){
            System.out.println("K");
        }
    }
}
