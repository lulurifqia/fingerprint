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
public class Kamera {
    public String KodeKamera;
    public String NamaKamera;
    public int JumlahKamera;

    public Kamera() {
    }

    public Kamera(String KodeKamera, String NamaKamera, int TotalHarga) {
        this.KodeKamera = KodeKamera;
        this.NamaKamera = NamaKamera;
        this.JumlahKamera = JumlahKamera;
    }

    public String getKodeKamera() {
        return KodeKamera;
    }

    public void setKodeKamera(String KodeKamera) {
        this.KodeKamera = KodeKamera;
    }

    public String getNamaKamera() {
        return NamaKamera;
    }

    public void setNamaKamera(String NamaKamera) {
        this.NamaKamera = NamaKamera;
    }

    public int getJumlahKamera() {
        return JumlahKamera;
    }

    public void setJumlahKamera(int JumlahKamera) {
        this.JumlahKamera = JumlahKamera;
    }

    @Override
    public String toString() {
        return "Kamera{" + "KodeKamera=" + KodeKamera + ", NamaKamera=" + NamaKamera + ", JumlahKamera=" + JumlahKamera + '}';
    }
}
