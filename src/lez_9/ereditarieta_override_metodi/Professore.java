package lez_9.ereditarieta_override_metodi;

import java.util.Objects;

public class Professore extends Persona{
    private String idProf;

    public Professore(String nome, String cognome, String idProf){
        super(nome, cognome);
        this.idProf = idProf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProf);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || !this.getClass().equals(obj.getClass())){
            return false;
        }
        Professore professore = (Professore) obj;
        return Objects.equals(professore.idProf, idProf);
    }
}
