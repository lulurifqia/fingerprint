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
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Zaky", "William", "Ahmad"};
        String[] alamat = {"Sragen", "Bandung", "Sumatra", "Cirebon"};
        int[] mahasiswa = new int [5];
        int counter = 0;
        
        Scanner scan = new Scanner (System.in);
        String queryNama = scan.nextLine();
        for (int i = 0; i < nama.length; i++){
            if (queryNama.equalsIgnoreCase(nama[i])){
                mahasiswa[counter] = i;
                counter++;
            }
        }
        for (int i = 0; i < counter; i++){
            System.out.println(alamat[mahasiswa[i]]);
        }
    }        
}
