/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan8;

import java.util.Scanner;

/**
 *
 * @author lulurifqiaa
 */
public class Soal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Nilai n: ");
        n = scan.nextInt();
        
        if(n == 1){
            System.out.println("*");
        }
        else if(n == 2){
            System.out.println("**");
        }
        else if(n == 3){
            System.out.println("***");
        }
        else{
            System.out.println("");
        }
    }
}
