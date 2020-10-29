package lez_9.ereditarieta_override_metodi;

import java.util.Objects;

public class Studente extends Persona{

    private String matricola;

    public Studente(String nome, String cognome, String matricola){
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public boolean equals(Object obj) {
        //Questa parte è sempre uguale quando sovrascrivo equals()
        if(this == obj){
            return true;
        }
        if(obj == null || !this.getClass().equals(obj.getClass())){
            return false;
        }
        //Questa la personalizzo
        Studente studente = (Studente) obj;
        return Objects.equals(studente.matricola, matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }
}
