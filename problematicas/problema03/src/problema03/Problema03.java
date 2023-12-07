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
        // Declarar variables
        int tempF = 20;
        double tempC;
        String acumulador = "";
        // Iniciar el ciclo repetitivo para realizar 20 iteraciones

        for (int i = 1; i <= 20; i++) {
            // Calcular la temperatura en celsius

            tempC = 5 / 9.0 * (tempF - 32);
            // Acumular cada iteracion

            acumulador = String.format("%s%d°F = %.2f°C\n", acumulador, tempF, tempC);
            // Aumentar en 4 tempF

            tempF += 4;
        }
        System.out.println(acumulador);
    }

}
