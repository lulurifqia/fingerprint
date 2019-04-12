/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Asosiasi;

/**
 *
 * @author lulurifqiaa
 */
public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
   
        public String getNrp() {
            return nrp;
        }
        public void setNrp(String nrp) {
            this.nrp = nrp;
        }
        public String getNama() {
            return nama;
        }
        public void setnama(String nama) {
            this.nama = nama;
        }
}
