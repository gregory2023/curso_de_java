import javax.swing.*;
/**
 * leer un numero y determinar si es negativo , este debe preguntar los numeros hasta recibir un 0 el cual marcara la salida del programa -- con funciones
 * se utliza interfaz grafica para los mensajes
 */
import static javax.swing.JOptionPane.*;

public class Ejercicio_bucles_01 {
    public static void main(String[] args) {
        int numero=0 ;

        showMessageDialog(null, numerp_negativo(numero));



    }

    //funcion para evaluar si el numero es negativo o positivo - termina al ingresar un 0
    public static double numerp_negativo(int n){
        n= Integer.parseInt(showInputDialog("ingrese el numero para evaluar"));

        while (n!=0){

            if (n>0){
                showMessageDialog(null, "El " + n + " es positivo ");
                n= Integer.parseInt(showInputDialog("ingrese el numero para evaluar"));
            }else{
                showMessageDialog(null, "El " + n + " es negativo ");
                n= Integer.parseInt(showInputDialog("ingrese el numero para evaluar"));
            }

        }
        return n;
    }
}
