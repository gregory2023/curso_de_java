public class condicionales {
    public static void main(String[] args) {

        boolean  EstaConectadaBluetoo = false;
        int archivos_enviados = 3 ;


        if (EstaConectadaBluetoo){
            //ENVIAR ARCHIVO
            archivos_enviados++;
            System.out.println("el archivo se envio " );
            System.out.println("total archivos " +  archivos_enviados);
        } else {
            //no se envio archivo
            archivos_enviados--;
            System.out.println("El archivo no se envio por favor valide la conexion ");
            System.out.println("total archivos " +  archivos_enviados);

        }
    }
}
