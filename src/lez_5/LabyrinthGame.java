package lez_5;

import java.util.Scanner;

public class LabyrinthGame {
    //P = player (1);
    //E = exit (1);
    //W = muro (10);
    //- = strada (13);

    private static char[][] labyrinth = new char[5][5];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        creaLabirinto();

        while(verificaFineDelGioco(labyrinth)){
            mostraLabirinto(labyrinth);
            System.out.println("In che direzione vuoi andare?");
            char mossa = sc.next().charAt(0);
            muovi(labyrinth, mossa);
        }

        System.out.println("*** HAI VINTO! ***");
    }

    private static void creaLabirinto(){
        for(int i=0; i<labyrinth.length; i++){
            for(int j=0; j<labyrinth[0].length; j++){
                labyrinth[i][j] = '-';
                labyrinth[0][2] = 'W';
                labyrinth[0][3] = 'W';
                labyrinth[1][1] = 'W';
                labyrinth[1][3] = 'W';
                labyrinth[2][0] = 'P';
                labyrinth[2][1] = 'W';
                labyrinth[2][3] = 'W';
                labyrinth[2][4] = 'W';
                labyrinth[3][2] = 'W';
                labyrinth[3][4] = 'E';
                labyrinth[4][0] = 'W';
                labyrinth[4][4] = 'W';
            }
        }
    }

    private static void mostraLabirinto(char[][] labirinto){
        System.out.println("*******************");
        for(int i=0; i<labirinto.length; i++){
            System.out.print("|  ");
            for(int j=0; j<labirinto[i].length; j++){
                System.out.print(labirinto[i][j]+"  ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.println("*******************");
    }

    private static int[] trovaPlayer(char[][] labirinto){
        int[] posizione = new int[2];
        for(int r=0; r<labirinto.length; r++){
            for(int c=0; c<labirinto[r].length; c++) {
                if(labyrinth[r][c] == 'P'){
                    posizione[0] = r;
                    posizione[1] = c;
                    System.out.println(labyrinth[r][c]+ " si trova alla posizione "+posizione[0]+"]"+"["+posizione[1]+"]");
                    break;
                }
            }
        }
        return posizione;
    }


    private static boolean muovi(char[][] labirinto, char command){
        int[] posizionePlayer = trovaPlayer(labirinto);
        int rowP = posizionePlayer[0];
        int colP = posizionePlayer[1];
        switch(command){
            case 'w':
                //Su
                if(rowP-1<0 || labirinto[rowP-1][colP] == 'W'){
                    return false;
                }
                labirinto[rowP][colP] = '-';
                labirinto[rowP-1][colP] = 'P';
                break;

            case 'a':
                //Sinistra
                if(colP-1<0 || labirinto[rowP][colP-1] == 'W'){
                    return false;
                }
                labirinto[rowP][colP] = '-';
                labirinto[rowP][colP-1] = 'P';
                break;

            case 's':
                //Giù
                if(rowP+1>4 || labirinto[rowP+1][colP] == 'W'){
                    return false;
                }
                labirinto[rowP][colP] = '-';
                labirinto[rowP+1][colP] = 'P';
                break;

            case 'd':
                //Destra
                if(colP+1<0 || labirinto[rowP][colP+1] == 'W'){
                    return false;
                }
                labirinto[rowP][colP] = '-';
                labirinto[rowP][colP+1] = 'P';
                break;

            default:
                System.out.println("ERRORE!");
                return false;
        }
        return true;
    }


    private static boolean verificaFineDelGioco(char[][] labirinto){
        for(int r=0; r<labirinto.length; r++){
            for(int c=0; c<labirinto[0].length; c++){
                if(labirinto[r][c] == 'E'){
                    return true;
                }
            }
        }
        return false;
    }
}
