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
public class Dog implements PetOut{
    private String nama;
    private String breed;

    public Dog() {
    }

    public Dog(String nama, String breed) {
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
        System.out.println("Gok...Gok...Gok...");
    }

    @Override
    public String toString() {
        return "Dog{" + "Nama = " + nama + ", Breed = " + breed + ", Umur = " + AGE_DOG + '}';
    }
}
