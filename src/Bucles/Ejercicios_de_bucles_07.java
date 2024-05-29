import java.util.Scanner;

/**
 * este codigo decrementa de 7 en 7
 */
public class Ejercicios_de_bucles_07 {
    public static void main(String[] args) {
        int numero=0;
        imprimir_numeros(numero);
    }

    public static int imprimir_numeros(int n){
        //Scanner Entrada = new Scanner(System.in);
        //System.out.println("Escriba de el numero para saber de cuanto en cuanto quiere que se impriman los numeros hasta el 11 ");
        //n = Entrada.nextInt();

        for (int i=100; i >0; i-=7){

            System.out.println(i);

        }


        return 0;
    }
}
