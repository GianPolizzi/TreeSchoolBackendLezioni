package lez_6.lampadina;

public class Interruttore extends InterruttoreGenerale{

    public Stato toggleLampadina(Lampadina l, InterruttoreGenerale gen) {
        switch (l.getStato()){
            case SPENTA:
                if(gen.getCorrente() == true){
                    l.setStato(Stato.ACCESA);
                    System.out.println(l.getStato());
                }
                break;
            case ACCESA:
                l.setStato(Stato.SPENTA);
                break;
            default:
                l.setStato(Stato.ROTTA);
        }
        return l.getStato();
    }
}
