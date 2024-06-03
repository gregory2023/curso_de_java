/*+
programa que crea dos arreglos que guardan valores ingresados por el usuario que luego guarda estos dos en un tercer arreglo
intercaladamente
 */


package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_05 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario
        int[] a = new int[10];  // Declarar y crear un arreglo de enteros de tamaño 10
        int[] b = new int[10];  // Declarar y crear otro arreglo de enteros de tamaño 10
        int[] a_b = new int[20];  // Declarar y crear un arreglo de enteros de tamaño 20 para almacenar la combinación de los dos arreglos anteriores

        // Leer 10 valores del usuario y almacenarlos en el arreglo 'a'
        for (int i = 0; i < 10; i++) {
            System.out.printf((i + 1) + " ingrese por favor el valor de la cadena uno  ");
            a[i] = Entrada.nextInt();
        }

        // Leer 10 valores del usuario y almacenarlos en el arreglo 'b'
        for (int i = 0; i < 10; i++) {
            System.out.printf((i + 1) + " ingrese por favor el valor de la cadena dos ");
            b[i] = Entrada.nextInt();
        }

        int j = 0;  // Inicializar el índice para el arreglo combinado 'a_b'
        // Combinar los arreglos 'a' y 'b' en 'a_b' intercalando sus elementos
        for (int i = 0; i < 10; i++) {
            a_b[j] = a[i];  // Añadir el elemento de 'a' en la posición actual de 'j'
            j++;
            a_b[j] = b[i];  // Añadir el elemento de 'b' en la nueva posición de 'j'
            j++;
        }

        System.out.printf("El arreglo tres esta compuesto por el arreglo uno y dos ");

        // Mostrar los elementos del arreglo combinado 'a_b'
        for (int i = 0; i < a_b.length; i++) {
            System.out.println(a_b[i]);
        }
    }
}
