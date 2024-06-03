/*
 * Reto2: Realiza una calculadora de IVA. para ello se deberán seguir la siguiente
 * secuencia de acciones:
 * a. Se pedirá al usuario que introduzca por consola un valor numérico (el
 * precio de adquisición de un artículo (sin IVA)) y también se le pedirá que
 * introduzca otro valor numérico (el IVA que se le ha aplicado).
 * b. El sistema calculará el precio del producto tanto sin IVA como con él
 * c. Finalmente se mostrarán ambos precios formateados
 */
package Retos_uax;

import java.util.Scanner;

public class Reto_03_uax {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario

        int precio;  // Declarar una variable para almacenar el precio sin IVA
        double iva;  // Declarar una variable para almacenar la tasa de IVA
        double precio_final;  // Declarar una variable para almacenar el precio final con IVA incluido

        // Bucle do-while para asegurarse de que el usuario introduce un precio válido (mayor que 0)
        do {
            System.out.printf("Ingrese el precio sin el IVA por favor: ");
            precio = Entrada.nextInt();  // Leer el precio sin IVA del usuario

            System.out.printf("Ingrese el IVA que le están cobrando (%): ");
            iva = Entrada.nextInt();  // Leer la tasa de IVA del usuario

        } while (precio <= 0);  // Repetir el bucle si el precio introducido es menor o igual a 0

        // Calcular el monto del IVA
        double precio_iva = (double) precio * (iva / 100);

        // Calcular el precio final con IVA incluido
        precio_final = precio + precio_iva;

        // Mostrar los resultados formateados
        System.out.println("El precio del IVA para este valor de: " + precio + " euros es de " + precio_iva + " euros.");
        System.out.println("El precio sin IVA es: " + precio + " euros.");
        System.out.println("El precio total es de: " + precio_final + " euros.");
    }
}
