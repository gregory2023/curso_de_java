/**
 * ejercicio que lee 5 numeros y los almacena en un ARREGLO Y LOS EMPRIME EN EL MISMO ORDEN
 */
package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];

        System.out.println("guardando los numeros ");
        //este for nos ayuda a poblar el arreglo con los datos del user
        for (int i=0 ; i < 5 ; i++){

            System.out.printf((i+1)+". ingrese un numero ");
            numeros [i]= entrada.nextFloat();
        }
        System.out.println("\n imprimir los elementos del arreglo ");

        //este foreach nos ayuda a imprimir el arreglo mucho mejor que el for normal
        for(float i : numeros){
            System.out.println(i);
        }


    }
}
