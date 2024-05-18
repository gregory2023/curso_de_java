import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean validarISBN() {
        String regex = "\\d{13}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(isbn);
        return matcher.matches();
    }
}





