/**
 * progrma para que nos muestre tres numeros ingresados por el usuario de mayor a menor
 */

import java.util.Scanner;
public class ejercicio_practico_09 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("ingrese el primer numero ");
        a = Entrada.nextInt();
        System.out.println("ingrese el segundo numero ");
        b = Entrada.nextInt();
        System.out.println("ingrese el tercer numero ");
        c = Entrada.nextInt();

        //se genera la condicional para cada numero siendo mayor o menos las unicas opciones por cada numerp
        if (a >= b && b >= c) {
            System.out.println(" 1.El numero mayor es " + a + " el numero del medio es " + b + " y el numero menor es " + c);

        } else if (a >= c && c >= b) {
            System.out.println("2.El numero mayor es " + a + " el numero del medio es " + c + " y el numero menor es " + b);

        } else if (b >= c && c >= a) {
            System.out.println("3.El numero mayor es " + b + " el numero del medio es " + c+ " y el numero menor es " + a);

        } else if (b >= a && a >= c) {

            System.out.println("4.El numero mayor es " + b + " el numero del medio es " + a + " y el numero menor es " + c);

        } else if(c >= a && a >= b) {
            System.out.println("5.El numero mayor es " + c + " el numero del medio es " + a + " y el numero menor es " + b);

        }else if (c>=b && b>=a){
            System.out.println("6.El numero mayor es " + c + " el numero del medio es " + b + " y el numero menor es " + a);
        } else {
            System.out.printf("error");
        }


    }
}
