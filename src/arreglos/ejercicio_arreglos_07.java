package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_07 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        // Declaración del arreglo de 10 elementos y las variables booleanas para el control de flujo
        int[] a = new int[10];
        boolean creciente = false;
        boolean decreciente = false;
        boolean igual = false;

        // Llenar el arreglo con datos ingresados por el usuario
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Ingrese el dato numérico N " + (i + 1) + ": ");
            a[i] = Entrada.nextInt();
        }

        // Comprobar la naturaleza del arreglo comparando cada elemento con el siguiente
        for (int i = 0; i < 9; i++) {
            if (a[i] < a[i + 1]) {
                creciente = true; // Se establece en verdadero si hay  creciente
            } else if (a[i] > a[i + 1]) {
                decreciente = true; // Se establece en verdadero si  decreciente
            } else if (a[i] == a[i + 1]) {
                igual = true; // Se establece en verdadero si hay elementos iguales
            }
        }

        // Evaluar las combinaciones de las variables booleanas para determinar la naturaleza del arreglo
        if (creciente == true && decreciente == false) {
            System.out.printf("Arreglo creciente ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        } else if (decreciente == true && creciente == false) {
            System.out.printf("Arreglo decreciente ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        } else if (igual == true && !creciente && !decreciente) {
            // Condición corregida para que 'igual' sea evaluado solo cuando no es creciente ni decreciente
            System.out.printf("Arreglo igual ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        } else if (creciente == true && decreciente == true) {
            System.out.printf("Arreglo desordenado ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }

        Entrada.close(); // Cerrar el Scanner después de su uso
    }
}


