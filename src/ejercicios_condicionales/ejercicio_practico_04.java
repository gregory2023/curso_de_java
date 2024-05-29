import javax.naming.NamingEnumeration;
import java.util.Scanner;
import java.util.SortedMap;

public class ejercicio_practico_04 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        //La aplicación pedirá por consola dos números.
        int n1 ;
        System.out.println("ingrese el primer numero");
        n1 = Entrada.nextInt();
        int n2 ;
        System.out.println("ingrese el segundo numero");
        n2 = Entrada.nextInt();


        //2.	El programa realizará las siguientes comprobaciones:
            //a.	Si ambos son pares

        if (n1 % 2 == 0 && n2 % 2 == 0){
            System.out.println("son pares los dos numeros  porque el modulo de n1 es: " + n1 % 2 + " y de n2 " + n2 % 2 );
        }else if (n1 % 2 != 0 && n2 % 2 != 0){
            System.out.println("son impares los dos numeros  porque el modulo de n1 es: " + n1 % 2 + " y de n2 " + n2 % 2 );
        } else if (n1 % 2 == 0 && n2 % 2 != 0) {
            System.out.println(" solo el primer numero es par porque su modulo es  " + n1 % 2  );
        }else {
            System.out.println("solo el segundo numero es par porque su modulo es " + n1 % 2);
        }


        //b.	Si el primer número es más grande que el doble del segundo y menos que 8

        if (n1 == (n2*2) && n1 > 8 ){
            System.out.println(n2);
            System.out.println("El numero uno es igual al  doble del segundo numero y es mayor  que 8 ");

        }else if (n1 < (n2*2) && n1 < 8 ){
            System.out.println(n2);
            System.out.println("el primero numero es menor que el doble del segundo y menor que 8 ");

        } else if (n1 > (n2*2) && n1 > 8) {
            System.out.println(n2);
            System.out.printf("El numero uno es mayor  que el doble del segundo y mayor que 8");

        }else if (n1 == 8 ) {
            System.out.println(n2);
            System.out.printf("n1 es mayor y mayor que 8 ");
        }

        //c.	Si el primer número es igual al segundo o la resta de ambos es menor que 0
        if ( n1 == n2 && n1 - n2 == 0){
            System.out.printf("El primer numero es igual al dos y  la resta de ambos es o ");

        }else {
            System.out.println("test");
        }



    }

}
