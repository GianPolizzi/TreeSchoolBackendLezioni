package lez_10.lambda.filtra_invio_messaggi;

public class Persona {

    private String nome;
    private String cognome;
    private String sesso="";
    private int eta;
    private String nazionalita="";

    public Persona(String nome, String cognome, String sesso, int eta, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.eta = eta;
        this.nazionalita = nazionalita;
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

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }
}
