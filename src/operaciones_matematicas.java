public class operaciones_matematicas {
    public static void main(String[] args) {

        double x =2.1;
        double y = 3;

        // aproxima a un numero hacia arriba
        System.out.println(Math.ceil(x));
        // aproxima a un numero hacia abajo
        System.out.println(Math.floor(x));
        // trae el valor de un numero elevado al otro
        System.out.println(Math.pow(x,y));
        //devuelve el numero mayor
        System.out.println(Math.max(x,y));
        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //calcular el area de un cuadrado
        double radio = 4;
        System.out.printf("el radio es " + Math.PI * Math.pow (radio,2) + " "  );

        //el area de una esfera
        // 4 *pi * r^2
        System.out.println("el area de la esfera es " + Math.PI * 4 * Math.pow(radio,y));

        //



    }
}
