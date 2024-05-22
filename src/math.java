import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double numero1 = 0  ;
        double numero2= 0;

        System.out.println("ingrse el numero base ");
        numero1 = Entrada.nextDouble();
        System.out.println("ingrse el numero exponente  ");
        numero2 = Entrada.nextDouble();

        double raiz_cuadrada = Math.pow(numero1,numero2);

        System.out.println("El resultado de los exponentes  es " + raiz_cuadrada);
    }
}
// continuamos con mas funciones de la clase Math
