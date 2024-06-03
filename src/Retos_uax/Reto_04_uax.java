/*
Reto3: Realiza una calculadora de sueldo. para ello se deberán seguir la siguiente
secuencia de acciones:
a. El programa pedirá por consola al usuario que introduzca dos valores
numéricos: el sueldo de un trabajador y su número de pagas.
b. El programa calculará el sueldo bruto, sueldo bruto mensual, sueldo neto,
sueldo neto anual, teniendo en cuenta que se aplica una retención del 0.15
c. Finalmente se mostrarán por consola todos los resultados obtenidos
 */
package Retos_uax;

import javax.swing.*;

public class Reto_04_uax {
    public static void main(String[] args) {
        double sueldo;
        int numero_pagas;
        double sueldo_bruto_mensual;
        double sueldo_bruto_anual;
        double sueldo_neto_anual;
        double sueldo_neto_mensual;
        double tasaRetencion = 0.15;  // Tasa de retención del 15%

        do {
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual neto por favor: "));
            numero_pagas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de pagas al año: "));
        } while (sueldo <= 0 || numero_pagas <= 0);  // Corrección: usar || en lugar de &&

        // Calcular el sueldo bruto mensual y anual
        sueldo_bruto_mensual = sueldo / (1 - tasaRetencion);
        sueldo_bruto_anual = sueldo_bruto_mensual * numero_pagas;

        // Calcular el sueldo neto anual
        sueldo_neto_anual = sueldo * numero_pagas;

        // El sueldo neto mensual es el mismo que el sueldo ingresado
        sueldo_neto_mensual = sueldo;

        // Mostrar los resultados
        System.out.println("Sueldo neto mensual: " + sueldo_neto_mensual + " euros");
        System.out.println("Sueldo neto anual: " + sueldo_neto_anual + " euros");
        System.out.println("Sueldo bruto mensual: " + sueldo_bruto_mensual + " euros");
        System.out.println("Sueldo bruto anual: " + sueldo_bruto_anual + " euros");

        // Mostrar los resultados en cuadros de diálogo
        JOptionPane.showMessageDialog(null, "Sueldo neto mensual: " + sueldo_neto_mensual + " euros");
        JOptionPane.showMessageDialog(null, "Sueldo neto anual: " + sueldo_neto_anual + " euros");
        JOptionPane.showMessageDialog(null, "Sueldo bruto mensual: " + sueldo_bruto_mensual + " euros");
        JOptionPane.showMessageDialog(null, "Sueldo bruto anual: " + sueldo_bruto_anual + " euros");
    }
}
