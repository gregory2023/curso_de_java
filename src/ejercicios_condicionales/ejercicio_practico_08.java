/** Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado de coeficiente reales
 *
 */
import java.util.Scanner;
public class ejercicio_practico_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double a ;
        double b ;
        double c ;
        double x ;

        System.out.println("ingrese el valor de a ");
        a = Entrada.nextInt();
        System.out.println("ingrese el valor de b");
        b = Entrada.nextInt();
        System.out.println("ingree el valor de c");
        c = Entrada.nextInt();

        double  x_parcial = b * b - 4 * a * c;

        x = (-(b) + Math.sqrt(x_parcial)) / 2 * a ;

        System.out.printf("el resultado de la cuadratica es " + x );
    }

}
