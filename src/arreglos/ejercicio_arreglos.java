package arreglos;

public class ejercicio_arreglos {
    public static void main(String[] args) {

        int [] Numeros = new int [13];

        Numeros[0]= 7;
        Numeros [1]=7;
        Numeros[3]= 7;
        Numeros[4]= 7;
        Numeros [5]=7;
        Numeros[6]= 7;
        Numeros[7]= 7;
        Numeros [8]=7;
        Numeros[9]= 7;
        Numeros[10]= 7;
        Numeros [11]=7;
        Numeros[12]= 7;

        // CON EL .length podemos imprimir el arreglo a si no sepamos la longitud
        for (int i=0 ; i<Numeros.length;i++){
            System.out.println(Numeros[i]);
        }

    }
}
