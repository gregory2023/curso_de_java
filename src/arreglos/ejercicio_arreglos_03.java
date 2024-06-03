/**
 * Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los
 * números
 * números positivos, la media de los negativos y contar el número de ceros.
 */
package arreglos;

import java.util.Scanner;

public class ejercicio_arreglos_03 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float [] numeros = new float[5];
        float  suma_positivo = 0;
        float  suma_negativos = 0;
        int conteo_positovos=0;
        int consteo_negativos=0;
        int suma_0 = 0;
        float media_positivos=0;
        float media_negativos=0;

        System.out.println(" Guarda los numeros ");

        //pedimos los datos a user y los guardamos en un arreglo posterior a esto validamos los negativos , los positivos y los ceros ingresados
        for (int i = 0; i < numeros.length ; i++) {
            System.out.printf((i+1)+ ". ingrese el numero " );
            numeros[i] = Entrada.nextFloat();

            //sacamos los ceros
            if (numeros[i]== 0){
                suma_0++;
            // sacamos los positivos
            }else if (numeros[i]>0) {

                conteo_positovos++;
                suma_positivo = suma_positivo+numeros[i];
            //sacamos los negativos
            } else if (numeros[i] < 0) {

                consteo_negativos++;
                suma_negativos+=numeros[i];

            }


        }

        //excepciones para la impresion de la media de los positivos
          if (conteo_positovos == 0){
              System.out.printf("no se puede sacar la media de los positivos porque no existe ");
          }else {
              media_positivos = (float) suma_positivo/conteo_positovos;
              System.out.println("la media de los positivos es " +media_positivos);
          }


          if (consteo_negativos==0){
              System.out.printf(" no se puede sacar la media de los negativos porque no existen");
          }else {
              media_negativos = (float) suma_negativos/consteo_negativos;
              System.out.printf("la media de los negativos es " +media_negativos);
          }


           if (suma_0==0){
               System.out.printf("\n no existen ceros en el arreglo");
           }else {
               System.out.println(" \n la suma de los ceros es " + suma_0);
           }



    }
}
