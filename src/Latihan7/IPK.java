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
public class IPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        double ipk;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Nilai IPK: ");
        ipk = scan.nextDouble();
        
        if(ipk >= 3.80){
            System.out.println("Summa Cum Laude");
        }
        else if(ipk >= 3.60 && ipk <=3.79){
            System.out.println("Magna Cum Laude");
        }
        else if(ipk >= 3.40 && ipk <= 3.59){
            System.out.println("Cum Laude");
        }
        else if(ipk >= 3.20 && ipk <= 3.39){
            System.out.println("High Merit");
        }
        else if(ipk >= 3.00 && ipk <= 3.19){
            System.out.println("Merit");
        }
        else{
            System.out.println("Nilai IPK di bawah 3.00");
        }
    }    
}
