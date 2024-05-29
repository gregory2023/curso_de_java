/** HACER UN PROGRAMA QUE , DADO UN NUMERO TOTAl DE HORAS , DEVUELVA EL NUMERO DE SEMANAS . DIAS Y HORAS EQUIVALENTES
 *
  */
import java.util.Scanner;
public class ejercicio_parctico_07 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int horas_total ;
        System.out.println("ingrse el numero de horas laboradas al mes ");
        horas_total = Entrada.nextInt();

        if (horas_total >0) {
            //dividimos el numero de horas ingresado por el numero de horas que hay en una semana
            int semanas = horas_total / 168 ;

            //con el residuo de la primera operacion lo volvemos a dividir por las horas del dia
            int dias = horas_total%168 /24 ;

            //con el residuo de las horas divididas de un dia sacamos las horas que quedan despues de las primeras operaciones
            int horas = horas_total%24 ;

            System.out.println("el numero de semanas es " + semanas + " con " + dias + " dias y " + horas + " horas ");

            //int horas = ;

        }else {
            System.out.println("numero no valido ");
        }





    }
}
