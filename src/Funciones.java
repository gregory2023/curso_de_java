public class Funciones {
    public static void main(String[] args) {

        double radio = 5;
        double area = Area_Circulo(radio);
        double pesos_colombianos = 2600000;
        double euro_peso = 4147;


        //metodos
        conversor_de_divisas(pesos_colombianos,euro_peso);
        Area_Esfera(radio);
        Area_Circulo(radio);
        Volumen_esfera(radio);
        convertidosr_de_divisas_switch(300, "pesos mexicanos");

        //impresiones
        System.out.println("la cantidad en euros es " + convertidosr_de_divisas_switch(300, "pesos mexicanos"));

        //comentario de una linea

        /*
            multiples lineas
         */

        /**
         * javadocs para comentar formalmente el cod
         */

    }

    public static double Area_Circulo(double r){
        //pi * r2 area de un circulo
        return Math.PI * Math.pow (r,2);

    }

    public static double Area_Esfera (double r ){
        //el area de una esfera
        // 4 *pi * r^2
        return  Math.PI * 4 * Math.pow(r,2);
    }
    public static  double Volumen_esfera (double r){
        //volumen de una esfera
        //(4/3)* pi *r3
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double conversor_de_divisas (double p , double e ){
        //convertidos de pesos colombianos a euros
        //se divide el valor del peso en euros con el total del valor ingresado en pesos colombianos
        return p/e;

    }

    /**
     * Descripcion esta funcion nos ayuda a convertir  divisas por medio de un switch
     * @param cantidad
     * @param divisa
     * @return cantidad --> es la cantidad que nos devuelve una vez se realize el calculo
     */
    public static double convertidosr_de_divisas_switch (double cantidad , String divisa){
        //convertidor de divisas a euros
        switch (divisa){
            case "pesos mexicanos" :
                cantidad = cantidad * 0.055 ;
                break;
            case "dolares" :
                cantidad = cantidad * 0.92;
                break;
            default:
                System.out.println("ingrese una opcion valida");

        }

        return cantidad;

    }
}
