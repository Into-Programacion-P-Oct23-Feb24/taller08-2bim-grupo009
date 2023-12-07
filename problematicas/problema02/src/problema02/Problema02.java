/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     *
     * Genere una solución en lenguaje java que dé como salida números en orden
     * invertido del 25 al 1.
     */
    public static void main(String[] args) {
        int a = 30;
        int b = 60;
        int c = 90;
        int d = 120;
        String acumulador = "";
        for (int i = 21; i >= 1; i--) {
            acumulador = String.format("%s%s-%s-%s-%s\n", acumulador, a, b, c, d);
            a--;
            b -= 2;
            c -= 3;
            d -= 4;
        }
        System.out.println(acumulador);
    }

}
