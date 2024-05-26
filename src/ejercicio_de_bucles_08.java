/**
 * programa que calcula la suma total de los numeros ingresados por el user
 */

import java.util.Scanner;

public class ejercicio_de_bucles_08 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

       int suma = 0 ;
       int numero = 0;

       /*el for itera 10 veces en donde pide al user que ingrese un valor por cada vez , este valor se guarda en suma y por cada iteracion
       se suma el nuevo valor de numero
        */

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("ingrese numero");
            numero = escaner.nextInt();
            System.out.println("numero ingresado es " + numero );
            suma = suma +numero;

        }
        //imprimimos
        System.out.println(" la suma de los numeros es " + suma );
    }
}
