package lez_7.tris;

import java.util.Scanner;

public class Scacchiera {

    static char[][] scacchiera = new char[3][3];
    private static final char PEDINA1 = 'X';
    private static final char PEDINA2 = 'O';

    //Turno giocatore 1 = true;
    //Turno giocatore 2 = false;
    private static boolean turno = false;



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row;
        int col;

        inizializzaScacchiera();
        mostraScacchiera(scacchiera);

        while(!checkTrisPlayer1() && !checkTrisPlayer2()){

            setGiocatore();
            System.out.println("Dove vuoi inserire la pedina?");
            System.out.println("Inserire numero riga: ");
            row = scan.nextInt();
            System.out.println("Inserire numero colonna: ");
            col = scan.nextInt();

            if(mossaSbagliata(row,col)){
                System.out.println("Mossa non consentita...Ripeti!");
                setGiocatore();
            }
            else{
                inserisciPedina(getGiocatore(), row, col);
                mostraScacchiera(scacchiera);
            }
        }
    }

    private static void inizializzaScacchiera(){
        for (int r=0; r<scacchiera.length; r++){
            for(int c=0; c<scacchiera.length; c++){
                scacchiera[r][c] = '-';
            }
        }
    }

    private static void mostraScacchiera(char[][] sca){
        System.out.println("*************");
        for(int i=0; i<sca.length; i++){
            System.out.print("|  ");
            for(int j=0; j<sca[i].length; j++){
                System.out.print(sca[i][j]+"  ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println("*************");
    }


    private static void inserisciPedina(boolean turn, int r, int c){
        outer : for(int i=0; i<scacchiera.length; i++){
            for(int j=0; j<scacchiera[i].length; j++){
                if(scacchiera[i][j] == scacchiera[r][c] && scacchiera[i][j] == '-'){
                    if(turn){
                        scacchiera[r][c] = PEDINA1;
                        break outer;
                    }
                    else{
                        scacchiera[r][c] = PEDINA2;
                        break outer;
                    }
                }
            }
        }
    }

    private static boolean checkTrisPlayer1(){
        if((scacchiera[0][0] == 'X' && scacchiera[0][1] == 'X' && scacchiera[0][2] == 'X') ||
                (scacchiera[1][0] == 'X' && scacchiera[1][1] == 'X' && scacchiera[1][2] == 'X') ||
                (scacchiera[2][0] == 'X' && scacchiera[2][1] == 'X' && scacchiera[2][2] == 'X') ||
                (scacchiera[0][0] == 'X' && scacchiera[1][0] == 'X' && scacchiera[2][0] == 'X') ||
                (scacchiera[0][1] == 'X' && scacchiera[1][1] == 'X' && scacchiera[2][1] == 'X') ||
                (scacchiera[0][2] == 'X' && scacchiera[1][2] == 'X' && scacchiera[2][2] == 'X') ||
                (scacchiera[0][0] == 'X' && scacchiera[1][1] == 'X' && scacchiera[2][2] == 'X') ||
                (scacchiera[0][2] == 'X' && scacchiera[1][1] == 'X' && scacchiera[2][0] == 'X')){
            System.out.println("\n *** Il giocatore 1 ha vinto! ***");
            return true;
        }
        else return false;
    }

    private static boolean checkTrisPlayer2(){
        if((scacchiera[0][0] == 'O' && scacchiera[0][1] == 'O' && scacchiera[0][2] == 'O') ||
                (scacchiera[1][0] == 'O' && scacchiera[1][1] == 'O' && scacchiera[1][2] == 'O') ||
                (scacchiera[2][0] == 'O' && scacchiera[2][1] == 'O' && scacchiera[2][2] == 'O') ||
                (scacchiera[0][0] == 'O' && scacchiera[1][0] == 'O' && scacchiera[2][0] == 'O') ||
                (scacchiera[0][1] == 'O' && scacchiera[1][1] == 'O' && scacchiera[2][1] == 'O') ||
                (scacchiera[0][2] == 'O' && scacchiera[1][2] == 'O' && scacchiera[2][2] == 'O') ||
                (scacchiera[0][0] == 'O' && scacchiera[1][1] == 'O' && scacchiera[2][2] == 'O') ||
                (scacchiera[0][2] == 'O' && scacchiera[1][1] == 'O' && scacchiera[2][0] == 'O')){
            System.out.println("\n *** Il giocatore 2 ha vinto! ***");
            return true;
        }
        else return false;
    }


    private static boolean setGiocatore(){
        if(turno){
            System.out.println("Turno giocatore 2");
            turno = false;
            return turno;
        }
        else{
            System.out.println("Turno giocatore 1");
            turno = true;
            return turno;
        }
    }

    private static boolean getGiocatore(){
        return turno;
    }

    //Controllare condizioni
    private static boolean mossaSbagliata(int r, int c){
        if(scacchiera[r][c] == 'X' || scacchiera[r][c] == 'O' || r<0 || r>2 || c<0 || c>2){
            return true;
        }
        else return false;
    }
}