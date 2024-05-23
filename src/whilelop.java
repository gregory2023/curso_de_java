public class whilelop {

    static  boolean Lampara_encendida = false;
    public static void main(String[] args) {
        Lampara_encendida = LamparaOnOff();
         int veces = 0;
        while (Lampara_encendida  && veces <= 10){
            ImprimeSOS();
            veces++;
        }


    }

    public static void ImprimeSOS() {
        System.out.println(". . . _ _ _ . . .");

    }

    public  static boolean LamparaOnOff (){

        //intercambia los estados de la variable ( la variable con estado false )
        return (Lampara_encendida )?false:true;
    }
}
