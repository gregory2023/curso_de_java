import java.util.Scanner;

public class ejercicio_parctico_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //1.	La aplicación pedirá al usuario introducir por consola un valor numérico (representará una cantidad de euros).

        //cantidad de  euros que quiere convertir
        double euros ;
        System.out.println("ingrese la cantidad en euros ");
        euros = Entrada.nextDouble();

        //condicional para validar que la cantidad sea valida

        if (euros <=0) {
            System.out.println("Valor no valido");

        } else {

            //menus de opciones para la visual del user
            System.out.println("------------------Conversor de divisas----------------------- ");
            System.out.println("------Ingrese la moneda que quiera comvertir de euros -------");
            System.out.printf("-------la cantidad de euros ingresada es: " + euros + "\n" );
            System.out.println("1.dolares.\n2.pesos colombianos. \n3.yenes. ");

            //opcion para entrar al menu
            int opcion ;
            System.out.println("ingrese la opcion de divisa");
            opcion = Entrada.nextInt();

            // 2.Una vez introducida se mostrará mediante un menú con tres opciones: si se quiere convertir a dólares, pc o yenes.

            switch (opcion){
                case 1:{
                    double euros_dolares= euros * 1.086 ;
                    System.out.println(euros + " euros equivalen a " + euros_dolares +  " dolares" );
                    break;
                }
                case 2: {
                    double euros_pesos = 4.086 * euros ;
                    System.out.println(euros +  " euros equivalen a " + euros_pesos + " pesos colombianos ");
                    break;
                }
                case 3 : {
                    double euros_yuanes =  7.86  * euros ;
                    System.out.println(euros +  " euros equivalen a " + euros_yuanes + " yuanes ");
                    break;
                }
                default:{
                    System.out.println(" Opcion no valida fin del programa ");
                    break;
                }

            }
        }






    }
}
