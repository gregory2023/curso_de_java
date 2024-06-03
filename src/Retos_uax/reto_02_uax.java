import javax.swing.*;
import java.util.Random;

/**
 * 1. La aplicación pedirá por consola que introduzca un número. Dicho número representará el número de números aleatorios que generará el sistema.
 * 2. Cuando el usuario haya introducido el número, el sistema calculará: número más grande generado, número más pequeño generado y media de los números generados.
 * 3. El sistema mostrará por consola cada uno de los datos calculados con el siguiente formato:
 *    - Número más grande generado
 *    - Número más pequeño generado
 *    - Media de los números generados
 */
public class reto_02_uax {

    public static void main(String[] args) {
        Random random = new Random();  // Crear una instancia de la clase Random para generar números aleatorios
        int cantidad_numeros_max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números que quiere crear"));  // Pedir al usuario la cantidad de números a generar y convertirlo a entero
        int[] numeros = new int[cantidad_numeros_max];  // Crear un arreglo para almacenar los números generados

        // Generar los números aleatorios y almacenarlos en el arreglo
        for (int i = 0; i < cantidad_numeros_max; i++) {
            numeros[i] = random.nextInt(100);  // Generar un número aleatorio entre 0 y 99
            JOptionPane.showMessageDialog(null, "Número creado con éxito: " + numeros[i]);  // Mostrar un mensaje con el número generado
        }

        int mayor = numeros[0];  // Inicializar el número mayor con el primer elemento del arreglo
        int menor = numeros[0];  // Inicializar el número menor con el primer elemento del arreglo
        int suma = 0;  // Inicializar la suma en 0

        // Iterar sobre el arreglo para encontrar el mayor, menor y calcular la suma
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;  // Actualizar el número mayor si se encuentra uno más grande
            }
            if (num < menor) {
                menor = num;  // Actualizar el número menor si se encuentra uno más pequeño
            }
            suma += num;  // Acumular la suma de los números
        }

        double media = (double) suma / cantidad_numeros_max;  // Calcular la media de los números generados

        // Impresión por consola
        System.out.println("Número más grande generado: " + mayor);
        System.out.println("Número más pequeño generado: " + menor);
        System.out.println("Media de los números generados: " + media);

        // Impresión por ventanas emergentes
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
        JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
        JOptionPane.showMessageDialog(null, "La media de los números del arreglo es: " + media);
    }
}
