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
public class Tol_Pantura extends Tol{
    public String biaya;

    public Tol_Pantura() {
    }
    
    public Tol_Pantura(String biaya) {
        this.biaya = biaya;
    }
    public Tol_Pantura(String biaya, String asal, String tujuan) {
        super(asal, tujuan);
        this.biaya = biaya;
    }
    private void informasi(String biaya){
        System.out.println(biaya);
    }
    
    public void inform(String biaya){
        informasi(this.biaya);
    } 
}
