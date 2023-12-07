/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     *
     * Genere una solución en Java que permita presentar
     *
     *
     **
     ***
     ****
     *****
     *****
     ****
     ***
     **
     *
     *
     */
    public static void main(String[] args) {
        String acumulador = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                acumulador = String.format("%s*", acumulador);
            }
            acumulador = String.format("%s\n", acumulador);
            
            if (i>=5) {
                for (int j = 5; j < i; j--) {
                acumulador = String.format("%s*", acumulador);
            }
            acumulador = String.format("%s\n", acumulador);  
            }
        }
        System.out.println(acumulador);
    }

}
