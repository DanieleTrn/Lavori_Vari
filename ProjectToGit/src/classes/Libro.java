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
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(null == o){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Libro l = (Libro)o;
        return this.getIsbn() == l.getIsbn();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.isbn;
        return hash;
    }
}
