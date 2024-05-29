/**
 * Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */

import java.util.Scanner;

public class ejercicio_de_bucles_14 {
    public static void main(String[] args) {
        Scanner  Entrada = new Scanner(System.in);
        int N_sueldos = 0 ;
        int sueldo;
        int sueldo_maximo=0;
        int bandera=0;
        System.out.printf("ingres el numero de sueldos que va ingresar");
        N_sueldos=Entrada.nextInt();


        if (N_sueldos > 0 ){

            for (int i = 1; i <= N_sueldos ;i++){


                do{
                    System.out.println("ingrese la nomina " + i + " por favor ");
                    sueldo=Entrada.nextInt();

                }while (sueldo <=0);


                if (sueldo>sueldo_maximo){
                    System.out.println("nuevo sueldo mayor ingresado ");
                    sueldo_maximo=sueldo;
                }else {
                    System.out.println("valor ingresado con exito " + sueldo);

                }


            }

            System.out.println(" sueldo maximo " + sueldo_maximo);

        }else {

            while (N_sueldos >=0){

                System.out.println("numeros invalido , ingreselo de nuevo ");
                N_sueldos =Entrada.nextInt();
            }

        }








    }
}
