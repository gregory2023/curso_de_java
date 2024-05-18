public class Switch {
    public static void main(String[] args) {

        String Modo_de_Color = "dark";

        switch (Modo_de_Color) {
            case  "light":
                System.out.println("elegiste color light para tu tema");
                break;
            case  "night":
                System.out.println("elegiste color night para tu tema");
                break;
            case "blue dark":
                System.out.println("elegiste color blue dark para tu tema");
                break;
            case "dark":
                System.out.println("elegiste color dark para tu tema");
                break;
            default:
                System.out.println("selecciona una opcionn correcta ");

        }
    }
}
