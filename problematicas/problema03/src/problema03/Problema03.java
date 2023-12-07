/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     *
     * Genere una solución en JAVA que permita presentar un reporte de 20
     * conversiones de temperatura de Fahrenheit a Celsius. La tabla deberá
     * comenzar con un valor Fahrenheit de 20 grados e incrementarse en valores
     * de 4 grados. Se recomienda usar la fórmula:
     *
     */
    public static void main(String[] args) {
        int tempF = 20;
        double tempC = -1;
        System.out.println(tempC);

        String acumulador = "";
        for (int i = 0; i <= 20; i++) {
            tempC = 5 / 9 * (tempF - 32);
            acumulador = String.format("%s%d°F = %.2f°C\n", acumulador, tempF, tempC);
            tempF += 4;
        }
        System.out.println(acumulador);
    }

}
