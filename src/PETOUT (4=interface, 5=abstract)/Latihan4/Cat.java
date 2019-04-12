/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author lulurifqiaa
 */
public class Cat implements PetOut {
    private String nama;
    private String breed;

    public Cat() {
    }

    public Cat(String nama, String breed) {
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
        public void sound() {
            System.out.println("Meong... Meong...Meong...");
    }
        
    @Override
    public String toString() {
        return "Cat{" + "Nama = " + nama + ", Breed = " + breed + ", Umur = " + AGE_CAT + '}';
    }

    

    
    
    
}
