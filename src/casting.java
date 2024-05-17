public class casting {
    public static void main(String[] args) {

        // en un año ubicar 30 perritos
        //cuanto perritos ubique en un mes
        double perritos_mes = 30.0/12.0 ;
        System.out.println("la cantidad de perritos al mes son " + perritos_mes);
        //trasnformamos el tipo de dato de un double a un entero

        int aproximacion_perros_mes = (int) perritos_mes;

        System.out.println(aproximacion_perros_mes);

        //exactitud

        int a = 30;
        int b = 12 ;
        System.out.println("los perros al mes fueron " + (double) a/b);

        double c  = (double) a/b;
        System.out.println(c);

        char n ='1';
        int nI = n ;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
