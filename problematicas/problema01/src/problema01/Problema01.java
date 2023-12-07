/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

//        String cadenaReporte = "";
        String listadoEdades ="Listado de Edades: ";
        String nombre;
        String posicion;
        String listado = "Listado de Jugadores";
        int sumaedades = 0;
        double promedioestaturas = 0;
        double promedioedad = 1;
        int edad;
        double estatura;
        int limite;
        int contador = 0;
        System.out.println("Ingrese el numero de jugadores; ");
        limite = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            
            listadoEdades=String.format("%s %s",listadoEdades,edad);
            sumaedades = sumaedades + edad;

            promedioestaturas = promedioestaturas + estatura;

            contador = contador + 1;

            listado = String.format("%s\n%d. %s -%s-, edad %d, estatura %.2f",
                    listado,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);

        }
        promedioedad = (double) sumaedades / contador;
        promedioestaturas = (double) promedioestaturas / contador;

        listado = String.format("%s\n%s\nPromedio de edades: %.2f Promedio de Estaturas: %.2f",
            listado,listadoEdades,promedioedad,promedioestaturas);
        System.out.printf("%s\n", listado);
    }

}
