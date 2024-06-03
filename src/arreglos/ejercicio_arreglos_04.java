/**
 * Leer 10 números
 * enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
 * ejemplo
 * 1
 * 10
 * 2
 * 9
 * 3
 * 8
 * 4
 * 7
 * 5
 * 6
 */
package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_04 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int [] numeros = new int[10];

        //ingresemos los numeros del 1-10 del user
        for (int i = 0; i <=9 ; i++) {

            System.out.printf((i)+ ". ingrese el numero ");
            numeros[i]=Entrada.nextInt();
        }

        /*imprimimos segun el orden
         1. el for imprime de la posicion 0 a la 4 o sea del 1 al 5 y luego con el println imprimimos del 9 al 5
         */
        for (int i = 0; i <=4 ; i++) {
            System.out.println(numeros[i]);


            /* 2. esto va asi .1--> 9-i(i vale 0 en la primera iteracion ) = posicion 9 (10)
                            .2 --> 9-i(i vale 1 en la segunda iteracion ) = posicion 8 (9) ...
             */
            System.out.println(numeros[9-i]);

        }
    }
}
