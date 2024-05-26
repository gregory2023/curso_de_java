/**
 *programa que  Pide 10 sueldos.
 * Mostrar su suma y cuantos hay mayores de $1000.
 */

import java.util.Scanner;

public class ejercicio_de_bucles_10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int sueldo ;
        int suma_mayor_100=0;
        int suma_menor_100=0;

        int contador_mayores=0;


        //pide los 10 sueldos principalmente
        for (int i=1 ; i <=10 ; i++){
            System.out.println("ingrese su sualdo en euros ");
            sueldo = Entrada.nextInt();
        //valida si es mayor a 100 lo suma a conteo general de sueldos mayores a 100
            if (sueldo > 1000 ){
                System.out.println(" este sueldo es mayor que 1000 ");
                suma_mayor_100 += sueldo;
                contador_mayores++;
        //valida si es menos a 100 y lo suma a conteo general de sueldos menos a 100
            } else if ((sueldo < 1000) && (sueldo < 0)) {
                System.out.println("Este sueldo es menor que 1000");
                suma_menor_100 += sueldo;
            }else {
                System.out.println("sueldo no valido ");
            }

        }
        //suma todos los sueldos
        int suma_sueldos = suma_mayor_100+suma_menor_100;

        System.out.println(" los sueldos mayores a 1000 son " + contador_mayores + " y la suma de todos los sueldos son " + suma_sueldos );


    }
}
