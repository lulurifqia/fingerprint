/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Agregasi;

/**
 *
 * @author lulurifqiaa
 */
public class Jurusan {
    private int kd_jurusan;
    private String nm_jurusan;
    private Mahasiswa mhs;

    public Jurusan(int kd_jurusan, String nm_jurusan, Mahasiswa mhs) {
        this.kd_jurusan = kd_jurusan;
        this.nm_jurusan = nm_jurusan;
        this.mhs = mhs;
    }
    
    public int getKd_jurusan() {
        return kd_jurusan;
    }
    public void setKd_jurusan(int kd_jurusan){
        this.kd_jurusan = kd_jurusan;
    }
    public String getNm_jurusan() {
        return nm_jurusan;
    }
    public void setNm_jurusan(String nm_jurusan) {
        this.nm_jurusan = nm_jurusan;
    }
    public Mahasiswa getMhs() {
        return mhs;
    }
    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }
}
