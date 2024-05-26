import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showConfirmDialog;

public class ejercicios_de_bucles_11 {
    public static void main(String[] args) {
        String nombre ;
        int edades= 0;
        double altura=0;
        int edades_mayores=0;
        int contador_edades=0;
        int contador_altura=0;
        int suma_edades=0;
        int suma_altura=0;

        for (int i = 1 ; i <=2; i++){
            nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE ");

            edades = Integer.parseInt(JOptionPane.showInputDialog(" INGRESE SU EDAD "));
            if (edades <=0 ){
                while (edades <= 0) {

                    edades = Integer.parseInt(JOptionPane.showInputDialog(" ERROS , INGRESE DE NUEVO SU EDAD "));

                }

                contador_edades++;
                suma_edades += edades;

            }else {
                contador_edades++;
                suma_edades += edades;
            }

            altura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE SU ALTURA EN CM"));

            if (altura<=0 ){
                while (altura <= 0) {

                    altura = Integer.parseInt(JOptionPane.showInputDialog(" ERROS , INGRESE DE NUEVO SU ALTURA EN CM "));

                }

                contador_altura++;
                suma_altura += altura;

            }else {
                contador_altura++;
                suma_altura += altura;
            }

            JOptionPane.showMessageDialog(null," user guardado con exito \n nombre : " + nombre + " \n edad = " + edades + "\n altura " + altura + "CM");


        }

        System.out.println(contador_edades);
        System.out.println(contador_altura);
    }
}
