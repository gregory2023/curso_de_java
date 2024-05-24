import java.security.PublicKey;
import java.util.Scanner;

public class Retos_01_uax {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.printf("ingrese los segundos que quiere convertir a horas y minutos  ");
        int seg=Entrada.nextInt();

        converson_de_tiempo(seg);

    }

    public static void converson_de_tiempo(int segundos_totales){

        int horas = segundos_totales/3600;
        int minutos = (segundos_totales%3600)/60;
        int segundos = segundos_totales%60;
        System.out.println(horas + " " + minutos + " " + segundos);

    }
}

/**
 *Cálculo de horas:
 *
 * Para obtener el número de horas en una cantidad total de segundos, divides el total de segundos entre 3600.
 * Ejemplo: Si tienes 10,000 segundos, las horas serían 10,000 / 3600.
 *
 * Cálculo de minutos restantes:
 *
 * Primero, encuentras el resto de segundos después de haber extraído las horas usando el operador módulo (%). Esto te da los segundos restantes después de contar las horas completas.
 * Luego, divides estos segundos restantes entre 60 para obtener los minutos completos.
 * Ejemplo: Si tienes 10,000 segundos, primero obtienes los segundos restantes 10,000 % 3600, luego esos segundos restantes los divides entre 60.
 *
 * Cálculo de segundos restantes:
 *
 * Finalmente, encuentras los segundos que quedan después de extraer tanto las horas como los minutos. Usas el operador módulo (%) con 60 para obtener estos segundos restantes.
 * Ejemplo: Si tienes los segundos restantes de los cálculos anteriores, usas % 60 para obtener los segundos finales.
 */
