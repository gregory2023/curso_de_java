/*
Reto4. Realiza un conversor de bases. Para ello se deberán seguir la siguiente
secuencia de acciones:
a. El sistema pedirá por consola un valor numérico el cual será el número en
base10 (decimal) del que se quiere calcular su base2 (binario).
b. El sistema realizará los cálculos necesarios para realizar el cambio
(divisiones sucesivas entre 2). Puedes basarte en este ejemplo
http://recursostic.educacion.es/secundaria/edad/4esotecnologia/quincena
5/4q2_contenidos_2c.htm
c. Por último, se mostrará por consola el numero traducido en base 2
 */

package Retos_uax;  // Nombre del paquete

import javax.swing.*;  // Importación de la librería para mostrar diálogos gráficos

public class Reto_05_uax {  // Definición de la clase principal
    public static void main(String[] args) {  // Método principal

        int numeroD;  // Declaración de la variable para el número decimal ingresado por el usuario
        int residuo;  // Declaración de la variable para almacenar el residuo de la división
        String resultado_binario = "";  // Declaración e inicialización de la cadena para almacenar el resultado binario

        // Bucle do-while para asegurarse de que el usuario ingrese un número positivo
        do {
            // Solicita al usuario que ingrese un número positivo
            numeroD = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO POSITIVO QUE QUIERE CONVERTIR A BINARIO"));
        } while (numeroD <= 0);  // Continúa solicitando mientras el número sea menor o igual a 0

        // Bucle while para convertir el número decimal a binario
        while (numeroD > 0) {
            residuo = numeroD % 2;  // Calcula el residuo de la división del número por 2 (0 o 1)
            resultado_binario = residuo + resultado_binario;  // Agrega el residuo al principio de la cadena resultado_binario
            numeroD = numeroD / 2;  // Divide el número por 2 y actualiza el valor de numeroD
        }

        // Imprime el resultado binario en la consola
        JOptionPane.showMessageDialog(null,"EL numero en binario es " + resultado_binario);
    }
}

