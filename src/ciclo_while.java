import java.util.Scanner;

public class ciclo_while {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int contador ;
        int i=1;
        System.out.println("ingrese el numero de veces que quiere que se repita ");
        contador = Entrada.nextInt();

        while(i < contador){
            System.out.println(i);
            i++ ;
        }
    }
}

