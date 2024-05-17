public class ejercicio_practico_02 {
    public static void main(String[] args) {

        char a= 'z' ;//conviertelo a int
        int i = 250; //conviertelo a long y luego de long a short
        double a1 = 301.067; //conviertelo a long
        int b = 100; //súmale 5000.66 y conviertelo a float
        int c = 737; //multiplícalo por 100 y conviertelo a byte
        double d = 298.638; //divídelo entre 25 y conviertelo a long


        //solucion

        //conviertelo a int
        int c1 = (int) a;
        System.out.println(c1);
        //conviertelo a long y luego de long a short
        long i1 = (long) i ;
        System.out.println(i1);
        //conviertelo a long
        short i2 = (short) i1;
        System.out.println(i2);
        //conviertelo a long
        long a2 = (long) a1;
        System.out.println(a2);
        //súmale 5000.66 y conviertelo a float
        double b1 = (double) b + 500.66;
        System.out.println(b1);
        //multiplícalo por 100 y conviertelo a byte
        byte c2 =  (byte) c;
        System.out.println(c2*100);
        //divídelo entre 25 y conviertelo a long
        long d1 = (long) d / 25 ;
        System.out.println(d1);






    }
}
