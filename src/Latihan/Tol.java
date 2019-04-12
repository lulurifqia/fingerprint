/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author lulurifqiaa
 */
public class Tol {
    public String asal;
    public String tujuan;

    public Tol(){ 
    }

    public Tol(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }
    
    public void Informasi(){
        System.out.println("Asal: " + this.asal + " Tujuan: " + this.tujuan);
    }
}
