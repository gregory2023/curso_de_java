import java.util.Scanner;

public class dowhilelop {
    public static void main(String[] args) {
        int Respuesta = 0 ;

        do {
            System.out.printf("Seleccione la opcion deseada ");
            System.out.printf("1. movies  ");
            System.out.printf("2. series ");
            System.out.printf("0. salir  ");

            Scanner sc = new Scanner (System.in);
            Respuesta = Integer.valueOf(sc.nextLine());

            switch (Respuesta){
                case 1:
                    System.out.printf(" Elegiste peliculas ");
                    break;
                case 2:
                    System.out.printf(" Elegiste series ");
                    break;
                case 0:
                    System.out.printf(" saliste ");
                    break;
                default:
                    System.out.printf(" elige una opcion valida ");
                    break;
            }

        }while (Respuesta != 0 );

        System.out.println("se termino el programa");
    }
}
