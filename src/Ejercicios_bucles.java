/**
 ejercicio de bucles con funciones
 leer un numero y mostrar su cuadrado hasta que se ingrese un numero negativo
 */
import java.util.Scanner;

public class Ejercicios_bucles {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double numero = 0 ;


        System.out.println("ingrese el numero base ");
        numero = Entrada.nextDouble();

        System.out.println(numero_cuadrado(numero));
        System.out.println(leer_numero_negativo(numero));

    }


   //creamos la funcion para que que nos retorne el valor de un numero al cuadrado
    public static double numero_cuadrado (double n) {

        return  Math.pow(n,2);
    }

    //creamos esta funcion que basicamente hace lo mismo de arriba solo que esta valida el numero y se repite hasta que el numero sea negativo con un while
    public static double leer_numero_negativo (double n){
        Scanner Entrada = new Scanner(System.in);
        double resultado = 0;

        while (n >=0){

            resultado = n * n;
            System.out.println(resultado);
            System.out.println("ingrese el numero base ");
            n = Entrada.nextDouble();

        }

        return resultado ;
    }


}

