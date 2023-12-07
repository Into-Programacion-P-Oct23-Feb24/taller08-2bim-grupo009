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
        // Se crea un for que realize 10 iteraciones
        
        for (int i = 1; i <= 10; i++) {
            // Se crea un if para separar las 5 primeras iteraciones
            // Si i es menor o igual a 5
            
            if (i <= 5) {
                // Entonces se entra al ciclo for y se imprime cuantas i 
                // se tenga en el momento
                
                for (int j = 1; j <= i; j++) {
                    acumulador = String.format("%s*", acumulador);
                }
            }
            // Se crea otro if para las ultimas 5 iteraciones
            // Si i es mayor o igual a 6
            
            if (i >= 6) {
                // Entonces se entra al ciclo for y se imprime cuantas i
                // se tenga hasta que la condicion se cumpla
                
                for (int j = 10; j >= i; j--) {
                    acumulador = String.format("%s*", acumulador);
                }
            }
            // Se realiza un salto de linea para continuar con la siguiente iteracion
            
            acumulador = String.format("%s\n", acumulador);
        }
        // Se presenta la acumulacion
        
        System.out.println(acumulador);
    }

}
