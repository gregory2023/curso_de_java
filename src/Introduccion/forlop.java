public class forlop {

    static boolean lampara_encendida = false;
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {
            imprime_SOS();
            
        }
    }

    public static void imprime_SOS(){
        System.out.println(". . . _ _ _ . . .");

    }

    public static boolean invierte_estado_lampara (boolean l){
        return  (lampara_encendida)? false: true ;

    }
}
