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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tol t = new Tol("Tol_Pantura", "Tol_Suramadu");
        Tol_Pantura tp = new Tol_Pantura("10.000");
        Tol_Suramadu ts = new Tol_Suramadu("20.000");
        t.Informasi();
        tp.inform("10.000");
        ts.Informasi();
    } 
}
