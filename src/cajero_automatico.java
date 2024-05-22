/**
 * cajero automaticon , saldo , ingreso , retiro
 */

import java.util.Scanner;

public class cajero_automatico    {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int saldo = 1000;
        int ingreso;
        int retiro;
        String  nombre ;
        String contraseña ;
        String contraseña_correcta =  "1234";

        System.out.println("ingrese su nombre ");
        nombre = Entrada.next();
        System.out.println("ingrese su contraseña ");
        contraseña = Entrada.next();


        if (contraseña_correcta.equals(contraseña)){
            System.out.printf(" hola !! " + nombre);
            int opc ;
            System.out.println(" ingrese la opcion que desee \n 1. Ver saldo \n 2. Ingresar dinero \n 3. Retirar dinero   ");
            opc = Entrada.nextInt();
            switch (opc){
                case 1 : {
                    System.out.printf("El saldo actual es " + saldo + " euros ");
                    break;
                }
                case 2:{
                    System.out.println("ingrese el dinero que desea guardar en su cuenta");
                    ingreso = Entrada.nextInt();
                    saldo=saldo+ingreso;
                    System.out.printf("Su saldo actual es " + saldo + " euros ");
                    break;
                }
                case 3:{
                    System.out.println("Cuanto dinero quiere retirar ?");
                    retiro = Entrada.nextInt();
                    if(retiro <= saldo){
                        saldo = saldo-retiro;
                        System.out.println("Retiro exitoso , su saldo actual es de  " + saldo + " euros ");
                    }else{
                        System.out.println("saldo insuficiente para la transaccion ");
                        System.out.println("saldo actual " + saldo + " euros , ---  dinero que quiere retirar " + retiro + " euros ");
                    }
                    break;
                }
            }
        }else {
            System.out.printf("Contrasela incorrecta señor " + nombre);
        }



    }
}
