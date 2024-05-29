import java.util.Random;
import java.util.Scanner;

public class Juego_de_adivinanzas {
    public static void main(String[] args) {
        int n_aleatorio=0;
        int numero_usuario=0 ;

        numero_aleatorio(numero_usuario,n_aleatorio);

    }

    //funcion para crear los numero aleatorios y la condicionales del juego
    public static int numero_aleatorio(int n, int n_user){
        //declaramos el objeto ramdom
        Random random = new Random();
        Scanner Entradaa = new Scanner(System.in);

        //le asignamos  a n el valor de un numero creado aleatoriamente por la maquina del 0 - 00
        n=random.nextInt(101);
        //System.out.println(n);

        //inicializamos el contador para que cuente el numero de intentos
        int contador = 0;


        do {

            System.out.printf("ingrese el numero del 1-100 para adivinar el numero \n");
            n_user=Entradaa.nextInt();
            contador++;

            //damos la pista segun el numeor que haya ingresado el user en relacion al numero que tiene que adivinar
            if (n_user < n){
                System.out.printf("pista !! , el numero que ingresaste es MENOR al numero que intentas adivinar \n");
            }else if (n_user > n ) {
                System.out.printf("pista !! , el numero que ingresaste es MAYOR al numero que intentas adivinar \n ");
            }

        }while (n_user != n );//hasta que sea true sale del bucle

        System.out.println("numero correcto " + n_user + " Felicidades ");
        System.out.println("numero de intentos finales " + contador);


        return n;
    }

}
