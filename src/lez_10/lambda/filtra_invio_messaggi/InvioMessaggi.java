package lez_10.lambda.filtra_invio_messaggi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class InvioMessaggi {

    List<Persona> iscritti = Arrays.asList(
            new Persona("Mario", "Rossi", "M", 35, "italiana"),
            new Persona("Lucy", "Parker", "F", 22, "inglese"),
            new Persona("Gianni", "Bianchi", "M", 20, "italiana"),
            new Persona("Fabio", "Marchi", "M", 40, "italiana"),
            new Persona("John", "Simpson", "M", 18, "USA"),
            new Persona("Adele", "Fabi", "F", 20, "italiana")
    );

    public List<Persona> getIscrittiFiltratiPer(Predicate<Persona> pred){
        List<Persona> persone = new ArrayList<Persona>();
        for (Persona p:iscritti)
            if (pred.test(p))
                persone.add(p);

        return persone;
    }

    public void sendMessage(String msg, List<Persona> persone){
        // Logica di Invio messaggio
        // .........

        System.out.println("Inviato messaggio a "+persone.size()+" iscritti");
    }

    public static void main(String[] args) {
        InvioMessaggi ms = new InvioMessaggi();

        // Predicates
        Predicate<Persona> allGiovaniDonne = p -> p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30;
        Predicate<Persona> allMaschi = p -> p.getSesso().equals("M");
        Predicate<Persona> allStranieri = p -> !p.getNazionalita().equals("italiana");

        // ------------ invio messaggio per giovani donne ---------------
        ms.sendMessage("messaggioX", ms.getIscrittiFiltratiPer(allGiovaniDonne));

        // ------------ invio messaggio per iscritti maschi ---------------
        ms.sendMessage("messaggioY", ms.getIscrittiFiltratiPer(allMaschi));

        // ------------ invio messaggio per iscritti stranieri ---------------
        ms.sendMessage("messaggioZ", ms.getIscrittiFiltratiPer(allStranieri));
    }
}
