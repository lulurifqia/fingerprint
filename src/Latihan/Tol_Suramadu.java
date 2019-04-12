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
public class Tol_Suramadu extends Tol{
    public String biaya;

    public Tol_Suramadu() {
    }

    public Tol_Suramadu(String biaya) {
        this.biaya = biaya;
    }

    public Tol_Suramadu(String biaya, String asal, String tujuan) {
        super(asal, tujuan);
        this.biaya = biaya;
    }
   
    public void informasi(String biaya){
        System.out.println("Tol Kebangaan");
    }
}
