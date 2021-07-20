package classes;

public class Persona {
    String cf;
    String nome;
    String cognome;

    public Persona(String cf, String nome, String cognome) {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    @Override
    public String toString(){
        return this.nome + " " + this.cognome;
    }
}
