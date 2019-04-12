/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

import Latihan4.*;

/**
 *
 * @author lulurifqiaa
 */
public class Duck extends ProfilAnimal implements PetOut {
    public Duck() {
    }

    public Duck(String nama, String breed) {
        super(nama, breed);
    } 
    
    @Override
    public void sound() {
        System.out.println ("kwek...kwek...kwek");
    }

    @Override
    public String toString() {
        return "Duck{" + super.toString() +
                "umur = " +AGE_DUCK +'}';
    }
}
