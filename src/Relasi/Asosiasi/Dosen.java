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
public class Dosen {
    private String Kddosen;
    private String[] nrpMHS;
    private int JmlMahasiswa;

    public Dosen(String Kddosen, String[] nrpMHS, int JmlMahasiswa) {
        this.Kddosen = Kddosen;
        this.nrpMHS = nrpMHS;
        this.JmlMahasiswa = JmlMahasiswa;
    }
    
        public String getKddosen() {
            return Kddosen;
        }
        public void setKddosen(String Kddosen) {
            this.Kddosen = Kddosen;
        }
        public String[] getNrpMHS() {
            return nrpMHS;
        }
        public void setNimMHS(String[] nrpMHS) {
            this.nrpMHS = nrpMHS;
        }
        public int getJmlMahasiswa() {
            return JmlMahasiswa;
        }
        public void setJmlMahasiswa(int JmlMahasiswa) {
            this.JmlMahasiswa = JmlMahasiswa;
        }
    
}
