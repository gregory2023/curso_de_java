/**Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número*
 *
 */

import com.sun.net.httpserver.SimpleFileServer;

import javax.swing.*;

public class ejercicio_de_bucles_12 {
    public static void main(String[] args) {
        int tabla ;
        int constante=1;
        int repeticiones=0;

        tabla = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA TABLA DE MULTIPLICAR QUE QUIERE VER "));



        if (tabla >=1){

            repeticiones = Integer.parseInt(JOptionPane.showInputDialog("INGRESE HASTA QUE NUMERO QUIRE QUE SE MUESTRE LA TABLA DE MULTIPLICAR  "));
            constante=tabla;

            for (int i = 1; i<= repeticiones; i++){
                tabla=(constante*i);

                System.out.println(tabla);

            }

        }else {
            System.out.println("numero invalido");
        }
    }
}
