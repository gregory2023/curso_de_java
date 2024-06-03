/*
Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
3 de la tabla A, 3 de la B, otros 3 de A, otros
3 de la B, etc.
 */
package  arreglos;

import java.util.Scanner;

public class ejercicios_arreglos_06 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        // Declaración de arreglos
        int [] a = new int[12];
        int [] b = new int[12];
        int [] c = new int[12];
        int [] d = new int[36]; // Arreglo combinado

        // Llenar el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el dato numerico por favor, del arreglo A " + (i + 1) + " ");
            a[i] = Entrada.nextInt();
        }

        // Llenar el arreglo 'b'
        for (int i = 0; i < b.length; i++) {
            System.out.print("Ingrese el dato numerico por favor, del arreglo B " + (i + 1) + " ");
            b[i] = Entrada.nextInt();
        }

        // Llenar el arreglo 'c'
        for (int i = 0; i < c.length; i++) {
            System.out.print("Ingrese el dato numerico por favor, del arreglo C " + (i + 1) + " ");
            c[i] = Entrada.nextInt();
        }

        // Combinación de los arreglos 'a', 'b' y 'c' en 'd' de tres en tres
        int j = 0; // Índice para el arreglo 'd'
        for (int i = 0; i < 12; i += 3) {
            // Añadir tres elementos de 'a' a 'd'
            for (int k = 0; k < 3; k++) {
                if (i + k < 12) {
                    d[j++] = a[i + k];
                }
            }
            // Añadir tres elementos de 'b' a 'd'
            for (int k = 0; k < 3; k++) {
                if (i + k < 12) {
                    d[j++] = b[i + k];
                }
            }
            // Añadir tres elementos de 'c' a 'd'
            for (int k = 0; k < 3; k++) {
                if (i + k < 12) {
                    d[j++] = c[i + k];
                }
            }
        }

        // Mostrar el contenido del arreglo 'a'
        System.out.print("Arreglo A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Mostrar el contenido del arreglo 'b'
        System.out.print("Arreglo B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        // Mostrar el contenido del arreglo 'c'
        System.out.print("Arreglo C: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // Mostrar el contenido del arreglo combinado 'd'
        System.out.print("Arreglo combinado D: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}
