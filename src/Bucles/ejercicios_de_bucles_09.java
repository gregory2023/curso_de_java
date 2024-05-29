/**
 * programa que pide al usuario 10 numeros y determina la media de los numerps posritivos , la media de los negativos y por ultimo cuenta los 0
 */

import java.util.Scanner;

public class ejercicios_de_bucles_09 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numero = 0;
        double numeros_positivos = 0;
        double numeros_negativos = 0;
        // con estos contadores podemos saber exactamente cuantos numeros hay por cada uno de los itens solicitados
        int contador_positivo = 0;
        int contador_negativo = 0;
        int contador_ceros = 0;



        // con este for pedimos 10 numeoros
        for (int i = 1; i <= 10; i++) {
            System.out.println("ingrese el numero por favor ");
            numero = Entrada.nextInt();
        //con este primer if validamos si el numero ingresado es positivo
            if (numero > 0) {
                System.out.println("numero positivo");
                numeros_positivos = numeros_positivos + numero;
                contador_positivo++;
                //con este segundo if validamos si el numero ingresado es negativo
            } else if (numero < 0) {
                System.out.println("numero negativo ");
                numeros_negativos = numeros_negativos + numero;
                contador_negativo++;
                //con este else cogemos los numeros 0
            } else {
                System.out.println("numero 0 ");
                contador_ceros++;

            }
        }

        // primer declaramos las bariables donde almacenamos las medias de los numeros por separado y luego comvertimos el tipo de datos que vamos a almacenar  para luego hacer el calculo
        double media_positivos = (double) numeros_positivos / contador_positivo;
        double media_negativos = (double) numeros_negativos / contador_negativo;

        System.out.println(" la media de los numeros positivos es " + media_positivos);
        System.out.println(" la media de los numeros positivos es " + media_negativos);
        System.out.println(" los numeros 0 ingresados fueron  " + contador_ceros);

    }
}
