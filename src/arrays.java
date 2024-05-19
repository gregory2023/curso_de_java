public class arrays {
    public static void main(String[] args) {
        //Declaracion de arrays
        String[] AndroidVersiones= new String[17];
        String days [] = new String[7];

        String[][] cities = new String[4][2];


        int  [][][] numbers = new int [2][2][2];
        int [][][][] numers4 = new  int  [2][2][2][2];

        //poblamos un arrays AndroidVersiones
        AndroidVersiones[0]= " bananas ";
        AndroidVersiones[1]= " manzanas";
        AndroidVersiones[2]= " peras ";
        AndroidVersiones[3]= " papayas ";
        AndroidVersiones[4]= " fresas ";
        AndroidVersiones[5]= " moras";

        //imprimimos el array  AndroidVersiones con un bucle for

        for (int i = 0; i < 17 ; i++) {
            System.out.println(AndroidVersiones[i]);

        }



        //poblamos el arrays cites
        cities [0][0] = "colombia ";
        cities [0][1] = "bogota ";
        cities [1][0] = "españa ";
        cities [1][1] = "madrid ";
        cities [2][0] = "francia ";
        cities [2][1] = "pau ";
        cities [3][0] = "portugal ";
        cities [3][1] = "lisboa ";

        //imprimimos el arrays de dos dimenciones con un for

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(cities[i][j]);
            }

        }

        //creacion de un arreglo de 4 dimenciones y luego acceder a un dato de ubicacion especifico
        String animals  [][][][] = new String[2][3][2][2];
        animals [1][0][0][1] =  "monkey";
    }
}
