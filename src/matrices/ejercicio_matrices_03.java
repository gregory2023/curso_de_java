package matrices;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_matrices_03 {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner Entrada = new Scanner(System.in);

        // Crear una instancia de Random para generar números aleatorios
        Random Ramdom = new Random();

        // Inicializar una variable para acumular la suma de los elementos de la matriz
        int suma = 0;

        // Declarar e inicializar una matriz de 3x3
        int[][] matriz = new int[3][3];

        // Llenar la matriz con números aleatorios y mostrar la posición cargada
        for (int i = 0; i < 3; i++) { // Itera sobre las filas
            for (int j = 0; j < 3; j++) { // Itera sobre las columnas de la fila actual
                System.out.println("Posición [" + i + "][" + j + "] cargada con éxito");
                // Asigna un número aleatorio entre 0 y 98 a la posición actual de la matriz
                matriz[i][j] = Ramdom.nextInt(99);
            }
        }

        // Calcular la suma de todos los elementos de la matriz
        for (int i = 0; i < 3; i++) { // Itera sobre las filas
            for (int j = 0; j < 3; j++) { // Itera sobre las columnas de la fila actual
                // Suma el elemento actual de la matriz a la variable suma
                suma += matriz[i][j];
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 3; i++) { // Itera sobre las filas
            for (int j = 0; j < 3; j++) { // Itera sobre las columnas de la fila actual
                // Imprime el elemento actual seguido de un espacio
                System.out.print(matriz[i][j] + " ");
            }
            // Imprime una nueva línea después de cada fila
            System.out.println(" ");
        }

        // Imprimir la suma de todos los elementos de la matriz
        System.out.println("La suma de todos los elementos es " + suma);
    }
}
