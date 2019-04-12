/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author lulurifqiaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peminjam peminjam = new Peminjam();
        Kamera kamera = new Kamera();
        
        SewaKamera [] Sewa = {peminjam};
        for (SewaKamera sewa : Sewa){
            System.out.println(sewa);
            System.out.println("Total Harga = " + sewa.TotalHarga());
        }
    }
}
