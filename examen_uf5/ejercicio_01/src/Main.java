public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aniadirlibro(new Libro("9780132350884", "test_01", "carlos "));
        biblioteca.aniadirlibro(new Libro("9780596007126", "test_02", "rodirgo"));
        biblioteca.aniadirlibro(new Libro("9780132350884", "test_03", "raul"));
        biblioteca.aniadirlibro(new Libro("9780132071482", "test_04", "samuel"));
        biblioteca.aniadirlibro(new Libro("9780134685991", "test_05", "gregory"));

        String tituloBuscado = "test_04";
        Libro libroEncontrado = biblioteca.buscarLibro(tituloBuscado);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("ISBN: " + libroEncontrado.getIsbn());
        } else {
            System.out.println("El libro con título '" + tituloBuscado + "' no se encontró en la biblioteca.");
        }
    }
}

