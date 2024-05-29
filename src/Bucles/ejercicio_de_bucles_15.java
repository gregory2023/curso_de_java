import java.util.Scanner;

public class ejercicio_de_bucles_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros;
        boolean hay_negativos = false;

        for (int i = 1; i <=10; i++ ){
            System.out.println("ingrese el numero ");
            numeros=entrada.nextInt();

            if (numeros <0 ){
                hay_negativos=true;
            }else {
                System.out.println("numero ingresado con exito ");
            }

        }
        System.out.println("hay numeros negativos " + hay_negativos);
    }
}
