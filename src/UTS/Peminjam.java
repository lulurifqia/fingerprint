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
public class Peminjam extends Kamera implements SewaKamera {
    public String NoId;
    public String NamaPeminjam;
    public String JenisId;
 
    public Peminjam() {
    }

    public Peminjam(String NoId, String NamaPeminjam, String JenisId, int Harga) {
        this.NoId = NoId;
        this.NamaPeminjam = NamaPeminjam;
        this.JenisId = JenisId;
    }

    public String getNoId() {
        return NoId;
    }

    public void setNoId(String NoId) {
        this.NoId = NoId;
    }

    public String getNamaPeminjam() {
        return NamaPeminjam;
    }

    public void setNamaPeminjam(String NamaPeminjam) {
        this.NamaPeminjam = NamaPeminjam;
    }

    public String getJenisId() {
        return JenisId;
    }

    public void setJenisId(String JenisId) {
        this.JenisId = JenisId;
    }

    @Override
    public int TotalHarga() {
        return HargaKamera * this.JumlahKamera;
    }
}
