/*


 */
package arreglos;

import java.util.Scanner;

public class Ejercicio_arreglos_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int[] a = new int[10];
        int numero;
        int numero2;
        int posicion;
        int posicion2;

        // Llenar el arreglo con 8 elementos
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el dato numérico N:" + (i + 1) + ": ");
            a[i] = Entrada.nextInt();
        }

        // Solicitar posiciones y valores hasta que las posiciones sean válidas
        do {
            System.out.print("Ingrese ahora la posición del arreglo en la que quiere incluir un valor (0-9) 1-: ");
            posicion = Entrada.nextInt();
            System.out.print("Ingrese ahora la posición del arreglo en la que quiere incluir un valor (0-9) 2-: ");
            posicion2 = Entrada.nextInt();
        } while (posicion > 9 || posicion2 > 9);

        System.out.print("Ahora ingrese el valor 1 por favor: ");
        numero = Entrada.nextInt();
        System.out.print("Ahora ingrese el valor 2 por favor: ");
        numero2 = Entrada.nextInt();

        // Desplazar elementos y agregar el primer valor
        if (posicion >= 0 && posicion <= 9) {
            for (int i = a.length - 1; i > posicion; i--) {
                a[i] = a[i - 1];
            }
            a[posicion] = numero;
        }

        // Ajustar la segunda posición si es mayor que la primera posición
        if (posicion2 > posicion) {
            posicion2++;
        }

        // Desplazar elementos y agregar el segundo valor
        if (posicion2 >= 0 && posicion2 <= 9) {
            for (int i = a.length - 1; i > posicion2; i--) {
                a[i] = a[i - 1];
            }
            a[posicion2] = numero2;
        }

        // Imprimir el contenido del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Entrada.close();  // Cerrar el Scanner
    }
}
