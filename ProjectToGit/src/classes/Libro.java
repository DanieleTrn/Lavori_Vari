package classes;

public class Libro {
    int isbn;
    String nomeLibro;

    public Libro(int isbn, String nomeLibro) {
        this.isbn = isbn;
        this.nomeLibro = nomeLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    @Override
    public String toString() {
        return this.nomeLibro + " " + this.isbn;
    }
    
    
}
