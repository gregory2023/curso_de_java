package matrices;

import java.util.Scanner;

public class ejercicio_uno {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int a [][] = {{1,2,3},{1,2,3},{1,2,3}};


        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println("");

        }

    }
}
