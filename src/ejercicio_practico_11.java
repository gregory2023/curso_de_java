/**
 * ejercicio de conversion de unidades de medida de peso con interfaz grafica
 */

import javax.swing.*;

public class ejercicio_practico_11 {
    public static void main(String[] args) {
        double resultado_libras;
        double resultado_gramos;
        double resultado_toneladas;

        String kg0;
        kg0 = JOptionPane.showInputDialog("ingrese los KG que quiere convertir a otra unidad de medida");
        int kg = Integer.parseInt(kg0);

        if (kg > 0){

            String opc0 = JOptionPane.showInputDialog("ingrese una opcion del tipo de medida que quiere convertir que ofrece el menu por favor \n 1. libras \n 2. gramos \n 3. toneladas ");
            int opc = Integer.parseInt(opc0);


            switch (opc){
                case 1 : {
                    resultado_libras=kg * 2.20;
                    JOptionPane.showMessageDialog(null," los " + kg + " kg ingresados son equivalente a " + resultado_libras + "libras" );
                    break;
                }
                case 2: {
                    resultado_gramos=kg * 1000;
                    JOptionPane.showMessageDialog(null," los " + kg + " kg ingresados son equivalente a " + resultado_gramos + "gramos" );
                    break;
                }
                case 3: {
                    resultado_toneladas=kg * 0.001;
                    JOptionPane.showMessageDialog(null," los " + kg + " kg ingresados son equivalente a " + resultado_toneladas + "toneladas" );
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null," opcion no valida" );

                }

            }

        }else {
            JOptionPane.showMessageDialog(null,"numero de kg invalido" );
        }
    }
}
