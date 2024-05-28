/**
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */

import java.util.Scanner;

public class ejercicio_de_bucles_13 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double notas;
        int aprobados=0;
        int reprobados=0;
        int condicionados=0;

        //pedimos los datos
        for (int i=1 ; i <= 2 ;i++ ) {

            //la nota debe ser mayor a 0 , por lo tanto se mete condicional y un do while para que le itere hasta que el user meta bien el dato
             do {

                 System.out.println("ingrese  la nota");
                 notas=Entrada.nextDouble();

             }while (notas <= 0 || notas >10);

                 System.out.println("Registro correcto");


             //condicionales para sumar cada nota a sus respectiva categoria
             if (notas>=5){
                 aprobados++;
             }else if (notas < 4){
                 reprobados ++;
             }else if (notas >= 4.0 && notas <=4.9){
                 condicionados ++;
             }

        }

        System.out.println("alumnos total aprobados  " + aprobados);
        System.out.println("alumnos total suspensos  " + reprobados);
        System.out.println("alumnos que tendran que habilitar " + condicionados);
    }
}
