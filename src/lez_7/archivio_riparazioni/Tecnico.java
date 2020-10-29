package lez_7.archivio_riparazioni;

public class Tecnico extends DittaRiparazioni{

    private String nome;
    private String cognome;

    private String[] tecnico = {
            nome,
            cognome,
    };

    Object[][] listaTecnici;
    //String[][] listaTecnici = new String[10][2];

    public String[] getTecnico() {
        return tecnico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTecnico(String[] tecnico) {
        this.tecnico = tecnico;
    }
}