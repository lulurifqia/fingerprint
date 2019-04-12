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

public class Dog extends ProfilAnimal implements PetOut {

    public Dog() {
    }

    public Dog(String nama, String breed) {
        super(nama, breed);
    }
   

    @Override
    public void sound() {
        System.out.println("guk...guk...guk");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "umur = " + AGE_DOG + '}';
    }

}
