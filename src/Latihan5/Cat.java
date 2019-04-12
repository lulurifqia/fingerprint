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

public class Cat extends ProfilAnimal implements PetOut {

    public Cat() {
    }

    public Cat(String nama, String breed) {
        super(nama, breed);
    }
    
    
    
    @Override
    public void sound() {
    System.out.println("meow...meow...meow");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "umur = " +AGE_CAT + '}';
    }
    
    
    
}
