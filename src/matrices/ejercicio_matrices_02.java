/**
 * ejericio que determina si una matriz es simetrica o no
 */
package matrices; // Declaración del paquete al que pertenece esta clase

import java.util.Random;
import java.util.Scanner; // Importación necesaria para leer la entrada del usuario

public class ejercicio_matrices_02 { // Nombre de la clase pública
    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa
        Scanner Entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        Random Ramdom=new Random();

        double matriz[][]; // Declaración de una matriz de enteros
        int Nfilas; // Declaración de una variable para el número de filas
        int Ncolumnas; // Declaración de una variable para el número de columnas
        Boolean Simetrica = true; // Variable para verificar si la matriz es simétrica

        // Bucle do-while para asegurarse de que el usuario ingrese valores positivos para filas y columnas
        do {
            System.out.print("Ingrese el número de filas por favor: ");
            Nfilas = Entrada.nextInt(); // Lectura del número de filas ingresado por el usuario
            System.out.print("Ingrese el número de columnas por favor: ");
            Ncolumnas = Entrada.nextInt(); // Lectura del número de columnas ingresado por el usuario
        } while (Nfilas < 0 || Ncolumnas < 0); // La condición asegura que ambos valores sean positivos

        matriz = new double[Nfilas][Ncolumnas]; // Inicialización de la matriz con el número de filas y columnas especificadas

        System.out.println("Digite la matriz por favor:");
        // Bucle anidado para llenar la matriz con datos ingresados por el usuario
        for (int i = 0; i < Nfilas; i++) { // Itera sobre cada fila
            for (int j = 0; j < Ncolumnas; j++) { // Itera sobre cada columna en la fila actual

                //System.out.print("Ingrese el dato en la siguiente posición [" + i + "][" + j + "]: ");
               // matriz[i][j] = Entrada.nextInt(); // Asigna el valor ingresado a la posición correspondiente en la matriz

                matriz[i][j]= Math.random();

            }
        }

        // Verificación de si la matriz es cuadrada (necesario para que sea simétrica)
        if (Nfilas == Ncolumnas) {
            int i = 0;
            // Bucle para verificar si la matriz es simétrica
            while (i < Nfilas && Simetrica == true) {
                int j = 0;
                while (j < i && Simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        Simetrica = false; // Si algún elemento no coincide, la matriz no es simétrica
                    }
                    j++; // Incremento del índice j
                }
                i++; // Incremento del índice i
            }

            if (Simetrica == true) {
                System.out.println("La matriz ingresada es simétrica.");
            } else {
                System.out.println("La matriz no es simétrica.");
            }
        } else {
            System.out.println("La matriz no es simétrica.");
        }
        System.out.println(" ");

        // Bucle anidado para imprimir la matriz
        for (int i = 0; i < Nfilas; i++) { // Itera sobre cada fila
            for (int j = 0; j < Ncolumnas; j++) { // Itera sobre cada columna en la fila actual
                System.out.print(matriz[i][j] + " "); // Imprime el valor de la posición actual seguido de un espacio
            }
            System.out.println(" "); // Imprime una nueva línea después de cada fila
        }

        System.out.print("matriz transpuesta ");
        System.out.println(" ");
        for (int i = 0; i < Nfilas; i++) { // Itera sobre cada fila
            for (int j = 0; j < Ncolumnas; j++) { // Itera sobre cada columna en la fila actual
                System.out.print(matriz[j][i] + " "); //transpuesta
            }
            System.out.println(" "); // Imprime una nueva línea después de cada fila
        }
    }
}
