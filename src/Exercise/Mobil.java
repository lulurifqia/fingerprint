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
public class Mobil {
    private String merk;
    private String NoPlat;
    private int TKeluaran;

    public Mobil(String merk, String NoPlat, int TKeluaran) {
        this.merk = merk;
        this.NoPlat = NoPlat;
        this.TKeluaran = TKeluaran;
    }
    
        public String getMerk() {
            return merk;
        }
        public void setMerk(String merk) {
            this.merk = merk;
        }
        public String getNoPlat() {
            return NoPlat;
        }
        public void setNoPlat(String NoPlat) {
            this.NoPlat = NoPlat;
        }
        public int TKeluaran() {
            return TKeluaran;
        }
        public void setTKeluaran(int TKeluaran) {
            this.TKeluaran = TKeluaran;
        }

    @Override
    public String toString() {
        return "Mobil{" + "merk=" + merk + ", NoPlat=" + NoPlat + ", TKeluaran=" + TKeluaran + '}';
    }
       
        
        
}
