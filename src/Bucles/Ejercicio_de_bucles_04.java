/**
 * Programa que suma los numeros de cada intento y luego saca la media de los mismos -- hasta que la condicion se cumpla
 */

import java.util.Scanner;

public class Ejercicio_de_bucles_04 {
    public static void main(String[] args) {
        int numero_user=0;
        suma_numeros_(numero_user);
    }

    public  static int suma_numeros_(int n){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        n=Entrada.nextInt();
        int suma=n;
        int cantidad_numeros_ingresados = 0;
        do {

            System.out.println("ingrese un numero ");
            n=Entrada.nextInt();
            suma=suma+n;
            cantidad_numeros_ingresados ++;
            //System.out.println(suma);

        }while (n !=0); //sale hasta que sea true

        float media =  (float) suma/cantidad_numeros_ingresados;
        System.out.printf("la suma de los numeros hasta que tecleara el 0 fue de " + suma + " y esta es la media " + cantidad_numeros_ingresados);
        return n;
    }
}
