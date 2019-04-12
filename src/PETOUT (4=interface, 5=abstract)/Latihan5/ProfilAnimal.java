/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author lulurifqiaa
 */
public abstract class ProfilAnimal {
    private String nama;
    private String breed;

    public ProfilAnimal() {
    }

    public ProfilAnimal(String nama, String breed) {
        this.nama = nama;
        this.breed = breed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "ProfilAnimal{" + "nama=" + nama + ", breed=" + breed + '}';
    }
    
    
     public abstract void sound();
}