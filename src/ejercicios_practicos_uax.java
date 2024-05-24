import java.security.PublicKey;
import java.util.Scanner;

/**
 * El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa para realizar una aplicación que realice la siguiente secuencia de acciones:
 *
 * 1.	La aplicación pedirá al usuario que se introduzcan dos números
 * 2.	Mediante un método multiplicar que admita por parámetros dichos números previamente introducidos se realizarán las siguientes acciones:
 * a.	Si el segundo operando es 0, el resultado será 0
 * b.	En caso contrario el resultado será la multiplicación de ambos números.
 * 3.	Una vez que el método creado en el punto 2 haya realizado todos los cálculos, se mostrará por consola el resultado de la operación
 *
 * Para la realización del ejercicio utiliza métodos y retornos que consideres oportunos
 */

public class ejercicios_practicos_uax {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int nu1 = 0;
        int nu2 = 0;
        int resultado;

        System.out.println("ingrese el primer numero");
        nu1 = Entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        nu2= Entrada.nextInt();

        resultado = nu1*nu2;

       multiplicar(nu1,nu2,resultado);


    }

    public static int multiplicar(int n , int n2, int resultado1){

        if(n2<=0){
            System.out.printf("el resultado de la multiplicacion es 0 ");
        }else {
            System.out.printf("el resultado de la multiplicacion es " + resultado1);
        }


        return resultado1 ;

    }
}
