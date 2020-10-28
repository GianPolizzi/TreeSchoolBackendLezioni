package lez_7.archivio_riparazioni;

public class Riparazione extends DittaRiparazioni{

    private final int MAX = 1;
    private final int MED = 2;
    private final int MIN = 3;

    private String indirizzoCliente;
    private String numeroCivico;
    private String priorita;

    String[][] tabellaRiparazioni = new String[10][3];


    public void setIndirizzoCliente(String i){
        this.indirizzoCliente = i;
    }

    public void setNumeroCivico(String n){
        this.numeroCivico = n;
    }

    public void setPriorita(String p){
        this.priorita = p;
    }

    public String getIndirizzoCliente(){
        return indirizzoCliente;
    }

    public String getNumeroCivico(){
        return numeroCivico;
    }

    public String getPriorita(){
        return priorita;
    }

    public void inizializzaTabellaRiparazioni(){
        for(int r=0; r<tabellaRiparazioni.length; r++){
            for(int c=0; c<tabellaRiparazioni[r].length; c++){
                tabellaRiparazioni[r][c] = "-";
            }
        }
    }


    public void showTabellaRiparazioni(){
        for(int riparazione=0; riparazione<tabellaRiparazioni.length; riparazione++){
            for(int dato=0; dato<tabellaRiparazioni[riparazione].length; dato++){
                System.out.print(tabellaRiparazioni[riparazione][dato]+ " ");
            }
            System.out.println();
        }
    }


    public void addRiparazione(String via, String num, String pr){
        outer : for(int riparazione=0; riparazione<tabellaRiparazioni.length; riparazione++){
            for(int dato=0; dato<tabellaRiparazioni[riparazione].length; dato++){
                if(tabellaRiparazioni[riparazione][dato] == "-"){
                    if(dato==0){
                        tabellaRiparazioni[riparazione][0] = via;
                    }
                    if(dato==1){
                        tabellaRiparazioni[riparazione][1] = num;
                    }
                    if(dato==2){
                        tabellaRiparazioni[riparazione][2] = pr;
                    }
                }
                //Salto al ciclo for esterno
                else continue outer;
            }
            break;
        }
    }

    public void controllaPrioritaMax(){
        outer : for(int riparazione=0; riparazione<tabellaRiparazioni.length; riparazione++){
            for(int dato=0; dato<tabellaRiparazioni[riparazione].length; dato++){
                if(tabellaRiparazioni[riparazione][2] == "1"){
                    System.out.print(tabellaRiparazioni[riparazione][0]+ " ");
                    System.out.print(tabellaRiparazioni[riparazione][1]+ " ");
                    continue outer;
                }
                else if(tabellaRiparazioni[riparazione][2] == "2"){
                    System.out.print(tabellaRiparazioni[riparazione][0]+ " ");
                    System.out.print(tabellaRiparazioni[riparazione][1]+ " ");
                    continue outer;
                }
                else{
                    System.out.print(tabellaRiparazioni[riparazione][0]+ " ");
                    System.out.print(tabellaRiparazioni[riparazione][1]+ " ");
                    continue outer;
                }
            }
            System.out.println();
        }
    }


}
