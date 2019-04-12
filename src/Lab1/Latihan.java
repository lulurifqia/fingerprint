/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author lulurifqiaa
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=5; i>=1; i--){
            for (int j=5; j > i; j--){
                System.out.print(" ");
            }
            for(int l=1; l<(i*2); l++){
                System.out.print(l);
            }
        System.out.println();
        }
    }
}

