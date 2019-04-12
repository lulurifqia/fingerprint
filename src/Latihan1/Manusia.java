/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author lulurifqiaa
 */
public class Manusia {
    int Tinggi;
    String Gender;
    
    public void Gender(){
        System.out.println("L/P: ");
        Scanner scan = new Scanner(System.in);
        Gender = scan.nextLine();
        switch(Gender){
            case "L":
                System.out.println("Laki-Laki");
                break;
            case "P":
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("Gender Salah!");
        }
        System.out.println("Gender: " + Gender);
    }
    
    public void Tinggi (){
        System.out.println("Tinggi: " + Tinggi + " cm");
    }
    void Nama(){
        
    }
 }
