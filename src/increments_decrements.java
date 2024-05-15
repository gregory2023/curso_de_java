public class increments_decrements {
    public static void main(String[] args) {
        int lives = 5 ;
        System.out.println(lives);// 5

        //decremento
        lives --;
        System.out.println(lives); //4

        //incremento
        lives++;
        System.out.println(lives); //5


        //prefija
        //gana un regalo por cada vida que gana
        int gift = 100 + ++lives ;
        System.out.println(gift);
        System.out.println(lives);

    }
}
