/** .length() ---> CUENTA LA CANTIDAD DE CARACTARESD DE UNA CADENA DE CARACTERE
 * .toLowerCase()-----> TRASFORMA LA PALABRAS EN minusculas
 * .toUpperCase()------> transforma las palabras en MAYUSCULAS
 */

import java.util.Scanner;

public class ejercicio_practico_06 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        //1.	La aplicación pedirá al usuario que introduzca por consola una palabra.
        System.out.println("Introdusca una palabra por favor");
        String palabra = Entrada.nextLine();

        //2.	Una vez introducida el sistema calculará la longitud de la palabra
        int contar_caracteres = palabra.length();
        System.out.println("cantidad de caracteres de la palabra que ingreso : " + contar_caracteres);

        //3.Dependiendo del resultado obtenido el sistema mostrará los siguientes avisos:

            //a.En el caso de que la palabra tenga una longitud inferior a 4 se mostrarla la palabra en MINUSCULAS
        if (contar_caracteres <= 4){
            System.out.println("la palabra es " + palabra.toLowerCase());

            //b.	En el caso de que la longitud sea diferente se mostrará la palabra en MAYUSCULAS
        }else{
            System.out.println("la palabra es " + palabra.toUpperCase());
        }

    }
}
