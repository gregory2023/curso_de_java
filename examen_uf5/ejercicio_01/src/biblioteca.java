import java.util.HashMap;

class Biblioteca {
    private HashMap<String, Libro> libros;

    public Biblioteca() {
        libros = new HashMap<>();
    }

    public void aniadirlibro(Libro libro) {
        libros.put(libro.getIsbn(), libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros.values()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
