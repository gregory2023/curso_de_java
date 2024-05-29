import java.util.Scanner;

public class ejercicio_de_bucle_16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int calificacion ;
        int suspenso=0;
        int aprobados=0;



        for (int i=1 ; i <=5 ; i++){

            do {

                System.out.printf("ingrese la nota " + i + " por favor ");
                calificacion=Entrada.nextInt();


            }while (calificacion == 0);

            if (calificacion<5 ){
                suspenso++ ;
            }else {
                aprobados++;
            }
        }

        System.out.println("estudiantes suspensos " + suspenso + " y aprobados " + aprobados);

    }
}
