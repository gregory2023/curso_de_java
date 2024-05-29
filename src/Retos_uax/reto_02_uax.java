import javax.swing.*;
import java.util.Random;

/**
 * 1.	La aplicación pedirá por consola que introduzca un número. Dicho número representará el número de números aleatorios que generará el sistema.
 * 2.	Cuando el usuario haya introducido el número, el sistema calculará: número más grande generado, número más pequeño generado y media de los números generados
 *
 * 3.	El sistema mostrará por consola cada uno de los datos calculados con el siguiente formato:
 *
 * -	Número más grande generado
 * -	Número más pequeño generado
 * -	Media de los números generados
 */
public class reto_02_uax {

    public static void main(String[] args) {
        Random random=new Random();
        int cantidad_numeros_max = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros que quiere crear "));
        int [] numeros  = new int[cantidad_numeros_max];

        for (int i = 0 ; i < cantidad_numeros_max ; i ++ ){
            numeros[i]=random.nextInt(100);
           JOptionPane.showMessageDialog(null," numero creado con exito  " + numeros[i]);
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int suma = 0 ;


        //este for aun no lo entiendo
        for (int num : numeros){
            if(num > mayor){
                mayor= num;
            }
            if (num < menor){
                menor = num;
            }
            suma += num;

        }

        double media = (double) suma/cantidad_numeros_max;

        //impresion por consola

        System.out.println("Número más grande generado: " + mayor);
        System.out.println("Número más pequeño generado: " + menor);
        System.out.println("Media de los números generados: " + media);

        //impresion por ventanas

        JOptionPane.showMessageDialog(null,"el numero mayor es " + mayor);
        JOptionPane.showMessageDialog(null,"el numero menor es " + menor);
        JOptionPane.showMessageDialog(null,"la media de los numeros del arreglo es  " + media);





    }
}