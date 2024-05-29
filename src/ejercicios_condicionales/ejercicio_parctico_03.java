/** nombre : gregory esteban cañon
    tercer ejercicio practico con Entrada y salida de datos por consola
 */

import java.util.Scanner;


public class ejercicio_parctico_03 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //1.	Realiza una aplicación que permita pedir tres valores números por consola

        int N1 ;
        System.out.println("ingrese el primer numero");
        N1= Entrada.nextInt();
        int N2 ;
        System.out.println("ingrese el segundo  numero");
        N2= Entrada.nextInt();
        int N3 ;
        System.out.println("ingrese el tercer numero");
        N3= Entrada.nextInt();

        //2.	Una vez introducidos los tres valores, comprobar si la suma de los dos primeros es igual que el tercero (a+b=c)
        if ((N1 + N2) == N3) {
            System.out.println("Los dos primeros son la suma del tercero");
        }else{
            System.out.printf("Los dos primeros no son la suma del tercero ");

        }

        //3.	Una vez realizada la comprobación mostrará por consola lo siguiente:
            //a.	Los dos primeros son la suma del tercero (en caso de serlo)
            //b.	Los dos primeros no son la suma del tercero (en caso de no serlo)


    }
}
