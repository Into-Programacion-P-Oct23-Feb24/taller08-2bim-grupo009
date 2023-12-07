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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

//        String cadenaReporte = "";
        String nombre;
        String posicion;
        String listado = "Listado de Jugadores";
        int sumaEdades = 0;
//        int contadorIteraciones = 0;
//        int contadorIteraciones1 = 1;
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

            sumaEdades = sumaEdades + edad;
            
            promedioEstaturas = promedioEstaturas + estatura;
            
            contador = contador + 1;

            listado = String.format("%s\n %d. %s -%s-, edad %d, estatura %.2f\n",
                    listado,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);

        }
        promedioEdad  = (double) sumaEdades / contador;
        
        listado  = String.format("%sPromedio de edades: %.2f\n",
            listado, promedioEdad);
        
        promedioEstaturas  = (double)promedioEstaturas / contador;
        
        listado  = String.format("%sPromedio de Estaturas: %.2f\n",
            listado, promedioEstaturas);
        System.out.printf ("%s\n", listado);
    }
    
        
}
