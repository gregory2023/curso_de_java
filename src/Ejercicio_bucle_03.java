import java.util.Scanner;

public class Ejercicio_bucle_03 {
    public static void main(String[] args) {

        int numero= 0;
        numero_negativo(numero);

    }

    public static int numero_negativo(int n){
        Scanner Entrada = new Scanner(System.in);
        System.out.printf("ingrese el numero");
        n= Entrada.nextInt();
        int contador=0;


        while (n > 0){

                    contador++;
                    System.out.println("numero de intentos fallidos  " + contador);
                    System.out.println("numero positivo " + n + " ingrese el numero negativo por favor  ");
                    n = Entrada.nextInt();
                }


                    System.out.println("numero negativo acertado " + n);
                    System.out.println("numero de intentos para acertar  " + contador);


                    Entrada.close();

        return n;
    }
}
