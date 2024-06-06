/**
 *Gregory esteban canon
 * z0521965p
 * ejercicio que recopila datos del user para determinar las dimenciones de la matriz
 */
package matrices; // Paquete al que pertenece esta clase

import javax.net.ssl.SSLContext; // Esta importación no es utilizada en este código y puede ser eliminada
import java.util.Scanner; // Importación necesaria para leer la entrada del usuario

public class ejercicio_matrices_01 { // Nombre de la clase pública
    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa
        Scanner Entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario

        int matriz [][]; // Declaración de una matriz de enteros
        int filas; // Declaración de una variable para el número de filas
        int columnas ; // Declaración de una variable para el número de columnas

        // Bucle do-while para asegurarse de que el usuario ingrese valores positivos para filas y columnas
        do {
            System.out.print("Ingrese por favor el numero de filas: ");
            filas = Entrada.nextInt(); // Lectura del número de filas ingresado por el usuario
            System.out.print("Ingrese por favor el numero de columnas: ");
            columnas = Entrada.nextInt(); // Lectura del número de columnas ingresado por el usuario
        } while (filas < 0 && columnas < 0); // Condición incorrecta, debería ser (filas <= 0 || columnas <= 0)

        matriz = new int[filas][columnas]; // Inicialización de la matriz con el número de filas y columnas especificadas

        // Bucle anidado para llenar la matriz con datos ingresados por el usuario
        for (int i = 0; i < filas; i++) { // Itera sobre cada fila
            for (int j = 0; j < columnas; j++) { // Itera sobre cada columna en la fila actual
                System.out.print("Ingrese el dato en la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = Entrada.nextInt(); // Asigna el valor ingresado a la posición correspondiente en la matriz
            }
        }

        // Bucle anidado para imprimir la matriz
        for (int i = 0; i < filas; i++) { // Itera sobre cada fila
            for (int j = 0; j < columnas; j++) { // Itera sobre cada columna en la fila actual
                System.out.print(matriz[i][j] + " "); // Imprime el valor de la posición actual seguido de un espacio
            }
            System.out.println(); // Imprime una nueva línea después de cada fila
        }
    }
}
