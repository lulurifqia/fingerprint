/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author lulurifqiaa
 */
public class Pemilik {
    private String nama;
    private String Alamat;
    private int JmlMobil;
    private String NoPlat;
    private Mobil Mbl;

    public Pemilik(String nama, String Alamat, int JmlMobil, String NoPlat, Mobil Mbl) {
        this.nama = nama;
        this.Alamat = Alamat;
        this.JmlMobil = JmlMobil;
        this.NoPlat = NoPlat;
        this.Mbl = Mbl;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String Alamat() {
        return Alamat;
    }
    public void setAlamat() {
        this.Alamat = Alamat;
    }
    private int getJmlMobil() {
        return JmlMobil;
    }
    public void setJmlMobil(int JmlMobil) {
        this.JmlMobil = JmlMobil;
    }
    public String getNoPlat() {
        return NoPlat;
    }
    public void setNoPlat() {
        this.NoPlat = NoPlat;
    }
    public Mobil getMbl() {
        return Mbl;
    }
    public void setMbl(Mobil Mbl) {
        this.Mbl = Mbl;
    }
}
