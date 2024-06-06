package arreglos;  // Definición del paquete

import java.util.Scanner;  // Importación de la clase Scanner para la entrada de datos

public class ejercicio_arreglos_09 {  // Definición de la clase principal
    public static void main(String[] args) {  // Método principal
        Scanner Entrada = new Scanner(System.in);  // Creación del objeto Scanner para la entrada de datos

        int[] a = new int[10];  // Declaración e inicialización del arreglo de 10 elementos
        int ultimo;  // Declaración de la variable para almacenar el último elemento del arreglo

        // Llenar el arreglo con datos ingresados por el usuario
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Ingrese el número N" + (i + 1) + ": ");
            a[i] = Entrada.nextInt();
        }

        // Almacenar el último elemento del arreglo
        ultimo = a[9];

        // Desplazar los elementos del arreglo hacia la derecha
        for (int i = 8; i >= 0; i--) {
            a[i + 1] = a[i];
        }

        // Colocar el último elemento en la primera posición
        a[0] = ultimo;

        // Imprimir el contenido del arreglo después del desplazamiento
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }

        Entrada.close();  // Cerrar el objeto Scanner
    }
}
