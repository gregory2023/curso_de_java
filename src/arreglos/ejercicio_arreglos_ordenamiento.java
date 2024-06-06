package arreglos;

import java.util.Arrays;  // Importación de la clase Arrays para utilizar el método de ordenamiento
import java.util.Scanner; // Importación de la clase Scanner para la entrada de datos del usuario

public class ejercicio_arreglos_ordenamiento {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        int[] a = new int[15]; // Declaración e inicialización de un arreglo de enteros con 15 elementos

        // Bucle para llenar el arreglo con datos ingresados por el usuario
        for (int i = 0; i < 15; i++) {
            System.out.printf("Ingrese el dato " + (i + 1) + " :");
            a[i] = Entrada.nextInt(); // Lectura del dato ingresado por el usuario y almacenamiento en el arreglo
        }

        Arrays.sort(a); // Ordenamiento del arreglo en orden ascendente usando el método sort de la clase Arrays

        // Bucle mejorado (for-each) para imprimir los elementos del arreglo ordenado
        for (int i : a)
            System.out.print(" " + i + " "); // Impresión de cada elemento del arreglo

        Entrada.close(); // Cierre del objeto Scanner para liberar recursos
    }
}
