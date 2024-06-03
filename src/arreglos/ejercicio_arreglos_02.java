/**
 * ejercicio que lee 5 numeros y los almacena en un ARREGLO Y LOS EMPRIME EN EL SENTIDO CONTRARIO
 */
package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_02 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int [] numeros = new int [6];

        System.out.println("Guardando numeros ");

        for (int i = 0 ; i<6 ; i++){
            System.out.printf((i+1) + ".  ingrese el numeros ");
            numeros[i]=Entrada.nextInt();

        }

        System.out.printf("\nlos numeros al contrario de su ingreso");

        for (int i = numeros.length-1; i>=0; i--){

            System.out.printf("\n"+numeros[i]);


        }
    }
}
