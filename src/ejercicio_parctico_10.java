/**
    programa que pide al user o utiliza un numero ramdom para imprimir un mensaje diciendo el numero de cifras que tiene dicho numero
 */

import java.util.Random;
import java.util.Scanner;

public class ejercicio_parctico_10 {
    public static void main(String[] args) {
        /*entrada de datos por el user
        Scanner Entrada = new Scanner(System.in);

         */

        //Generador de numeros aleatorios
        Random Generador = new Random();

        long numero;
        numero = Generador.nextInt(99999);

        /*System.out.printf("ingrese el nummero de 0 al 99 999");
        numero = Entrada.nextInt();

         */

        if (numero >=0 && numero <=99999){
            System.out.printf(" numero aprobado ---> " + numero);
            if (numero > 0 && numero <= 99){
                System.out.printf(" El numero ingresado tiene dos cifras ");
            } else if (numero > 99 && numero<= 999 ) {
                System.out.printf(" El numero ingresado tiene tres cifras");
            } else if (numero > 999 && numero <= 9999) {
                System.out.printf(" El numero ingresado tiene cuatro cifras");
            } else if (numero > 9999 && numero <= 99999) {
                System.out.printf(" El numero ingresado tiene cinco cifras");
            }

        }else {
            System.out.printf("el numero no cumple con los parametros intentelo de nuevo  ");
        }


    }
}
