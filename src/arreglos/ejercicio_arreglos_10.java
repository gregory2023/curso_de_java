/*
Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es
digitado por el usuario). sin funciones y explicado para dummies , y dime la complejidad del ejercici
 */

package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_10 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        // Declaración de un arreglo de 10 elementos
        int[] a = new int[10];
        int posiciones;
        int n_final;

        // Llenado del arreglo con datos ingresados por el usuario
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese el dato N:" + (i + 1) + ": ");
            a[i] = Entrada.nextInt();
        }

        // Solicitud del número de posiciones a desplazar el arreglo
        do {
            System.out.println("Ingrese el número de posiciones que quiere que se desplace el arreglo: ");
            posiciones = Entrada.nextInt();
        } while (posiciones <= 0);

        // Normalización de las posiciones a desplazar (asegura que esté entre 0 y 9)
        posiciones = posiciones % 10;

        // Desplazamiento del arreglo
        for (int i = 0; i < posiciones; i++) {
            // Guardar el último elemento del arreglo
            n_final = a[a.length - 1];

            // Desplazar todos los elementos una posición a la derecha
            for (int j = a.length - 2; j >= 0; j--) {
                a[j + 1] = a[j];
            }

            // Colocar el último elemento en la primera posición
            a[0] = n_final;
        }

        // Imprimir el contenido del arreglo después del desplazamiento
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }

        // Cerrar el objeto Scanner
        Entrada.close();
    }
}
