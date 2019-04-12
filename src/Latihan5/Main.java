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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck duck = new Duck ("angsa" , "Cirebon");
        Cat cat = new Cat ("si manis" , "Anggora");
        Dog dog = new Dog ("si hitam" , "Ciwawa");
                
        ProfilAnimal [] myAnimal = {duck,cat,dog};
        for (ProfilAnimal animal : myAnimal){
            System.out.println(animal);
            System.out.println ("Sound = ");
            animal.sound();
      
        }
        
    }
    
}
