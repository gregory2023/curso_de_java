/**
 * lee un numero hasta que este seao , mienras el numero no sea 0 los numeros ingresados se deben evaluar para saber si son pares o impares
 */

import java.util.Scanner;

public class Ejercicio_de_bucles_02 {
    public static void main(String[] args) {
        int numero= 0 ;
        System.out.println(N_pares_impares(numero));
    }

    public static int N_pares_impares(int n){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("ingrese el numeror por favor ");
        n=entrada.nextInt();

        while (n != 0){

            if(n%2 == 0 ){
                System.out.printf(" numero par ");
                System.out.printf(" ingrese el numeror de nuevo por favor ");
                n= entrada.nextInt();
            }else {
                System.out.printf(" numero impar ");
                System.out.printf(" ingrese el numero de nuevo por favor ");
                n= entrada.nextInt();
            }
        }

        return n;
    }
}
