/**
 * ejericio que pide  las edades y alturas de 5 alumnos, mostrar la edad la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de
  1.75
 */

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showConfirmDialog;

public class ejercicios_de_bucles_11 {
    public static void main(String[] args) {
        //declaramos las variales necesarias para cada punto
        //registro
        String nombre ;
        int edades= 0;
        double altura=0;

        //contadores para poder calcular la media
        int contador_edades=0;
        int contador_altura=0;

        //sumas de los itens para sacar totale
        int suma_edades=0;
        int suma_altura=0;
        int mayores_18 = 0;
        int mayor_175cm=0;

        // pide los 5 registros
        for (int i = 1 ; i <=5; i++){
            nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE ");
            //pide edad
            edades = Integer.parseInt(JOptionPane.showInputDialog(" INGRESE SU EDAD "));
            //valida que la edad sea mayor de 0
            if (edades <=0 ){
                //con este while pide la edad hasta que sea correcta
                while (edades <= 0) {

                    edades = Integer.parseInt(JOptionPane.showInputDialog(" ERROS , INGRESE DE NUEVO SU EDAD "));

                }

                //sumamos a los contadores si entra en este if
                contador_edades++;
                //suma el total de las edades para sacar la media  si entra en este if
                suma_edades += edades;

            }else {
                // si la edad esta correcta entra directo aca
                contador_edades++;
                suma_edades += edades;
            }

            //con este calculamos la cantidad de personas mayores a 18
            if (edades > 18){
                mayores_18 ++;
            }

            //pide altura
            altura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE SU ALTURA EN CM"));
            //valida altura
            if (altura<=0 ){
                //hasta que la altura sea valida
                while (altura <= 0) {

                    altura = Integer.parseInt(JOptionPane.showInputDialog(" ERROS , INGRESE DE NUEVO SU ALTURA EN CM "));

                }
                //suma a los contadores
                contador_altura++;
                //total de altura para la media
                suma_altura += altura;

            }else {
                //si la altura es correcta entra aqui directo
                contador_altura++;
                suma_altura += altura;
            }
            //calculamos las personas que miden mas de 175cm
            if (altura > 175){
                mayor_175cm ++;
            }

            //imprime cada registro
            JOptionPane.showMessageDialog(null," user guardado con exito \n nombre : " + nombre + " \n edad = " + edades + "\n altura " + altura + "CM");


        }

        double media_edades = (double) suma_edades/contador_edades;
        double media_altura = (double) suma_altura/contador_altura;


        System.out.println("media de las edades  " + media_edades);
        System.out.println("media de la altura " +media_altura);
        System.out.println("mayores de 18 " + mayores_18);
        System.out.println("miden mas de 1.75 "+ mayor_175cm);
    }
}
