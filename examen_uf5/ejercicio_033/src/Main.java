import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = null;

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Creación de la matriz");
            System.out.println("2. Comprobar si la matriz es cuadrada");
            System.out.println("3. Mostrar diagonal principal de la matriz");
            System.out.println("4. Contar números en la matriz");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de filas: ");
                    int filas = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas: ");
                    int columnas = scanner.nextInt();
                    matriz = new Matriz(filas, columnas);
                    matriz.llenarMatrizAleatoriamente();
                    break;
                case 2:
                    if (matriz != null) {
                        if (matriz.esCuadrada()) {
                            System.out.println("La matriz es cuadrada.");
                        } else {
                            System.out.println("La matriz no es cuadrada.");
                        }
                    } else {
                        System.out.println("No se ha creado una matriz. Por favor, cree una matriz primero.");
                    }
                    break;
                case 3:
                    if (matriz != null) {
                        matriz.mostrarDiagonalPrincipal();
                    } else {
                        System.out.println("No se ha creado una matriz. Por favor, cree una matriz primero.");
                    }
                    break;
                case 4:
                    if (matriz != null) {
                        int cantidadNumeros = matriz.contarNumeros();
                        System.out.println("La cantidad de números en la matriz es: " + cantidadNumeros);
                    } else {
                        System.out.println("No se ha creado una matriz. Por favor, cree una matriz primero.");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }
}


