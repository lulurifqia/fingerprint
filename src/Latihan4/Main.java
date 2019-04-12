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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck duck = new Duck("Angsa", "Cirebon");
        Cat cat = new Cat("Si Manis", "Anggora");
        Dog dog = new Dog("Si Hitam", "Ciwawa");
        
        PetOut[] syAnimal = {duck, cat, dog};
        for(PetOut animal : syAnimal){
            System.out.println(animal);
            System.out.println("Sound :: ");
            animal.sound();
        }
    }
}
