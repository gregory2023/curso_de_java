import java.util.Scanner;

public class dowhilelop {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner (System.in);
        int Respuesta ;

        do {
            System.out.println("Seleccione la opcion deseada ");
            System.out.println("1. movies  ");
            System.out.println("2. series ");
            System.out.println("0. salir  ");

            Respuesta = Entrada.nextInt();


            //Respuesta = Integer.valueOf(sc.nextLine());


            switch (Respuesta){
                case 1:
                    System.out.println(" Elegiste peliculas ");
                    break;
                case 2:
                    System.out.println(" Elegiste series ");
                    break;
                case 0:
                    System.out.println(" saliste ");
                    break;
                default:
                    System.out.println(" elige una opcion valida ");
                    break;
            }

        }while (Respuesta != 0 );

        System.out.println("se termino el programa");
    }
}
