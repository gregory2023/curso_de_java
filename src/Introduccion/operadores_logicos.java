public class operadores_logicos {
    public static void main(String[] args) {
        int a = 8 ;
        int b = 5 ;

        //operadores logicos

       // System.out.println("a es igual a b " + (a==b) );
        //System.out.println("a no es igual a b " + (a!=b));

        //operadores relacionales

        //System.out.println("a mayor que b " + (a>b));
        //System.out.println("a menor que b " + (a<b));
        //System.out.println("a es menor o igual que b " + (a<=b));
        //System.out.println("a es mayor o igual que b " + (a>=b));
       
        
        if(a==b){

            System.out.println("a es igual a b ");
            
        } else if ((a!=b) && (a>b) ) {

            System.out.println("a no es igual a b ");

            //esta tambien entraria si no hubiera modificado la scope anterior
        } else if (a>b) {

            System.out.println("a mayor que b ");

        } else if (a<b) {
            System.out.println("a menor que b ");
            
        } else if (a<=b) {

            System.out.println("a es menor o igual que b ");

        } else if (a>=b) {

            System.out.println("a es mayor o igual que b ");
            
        }


    }
}
