/**
imprime los numeros hasta el numero que ingresa el user
 */
import java.util.Scanner;

public class Ejercicios_de_bucles_06 {
    public static void main(String[] args) {
        int numero=0;
        imprimir_numero(numero);

    }

    public static int imprimir_numero(int n){
        Scanner Entrada = new Scanner(System.in);
        System.out.printf("ingrse el numero por favor");
        n=Entrada.nextInt();

        if(n>0){
            for (int i=1;i<=n;i++){
                System.out.println(i);
            }
        }else {
            System.out.printf("numero menor a 0 ingrese el numero de nuevo");
        }

        return n;
    }
}
