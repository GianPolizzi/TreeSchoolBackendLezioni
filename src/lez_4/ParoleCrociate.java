package lez_4;

//Tuturial codice + refactoring completo
//https://www.youtube.com/watch?v=vJdvvdNsl28&ab_channel=MeritCampus
public class ParoleCrociate {

    private static char[][] puzzle = {
            {'H','D','G','U','P','Y','S','P','A','O'},
            {'T','S','A','K','O','Y','O','L','P','S'},
            {'R','C','M','C','N','R','I','A','A','B'},
            {'I','O','B','A','I','S','C','T','L','A'},
            {'G','R','E','L','F','A','C','E','O','L'},
            {'L','F','R','A','L','L','U','S','I','E'},
            {'I','A','E','M','E','M','L','S','L','N'},
            {'A','N','T','A','D','O','C','A','G','A'},
            {'J','O','T','R','B','N','D','G','O','D'},
            {'L','Y','O','O','U','E','S','M','S','M'}
    };
    private static String[] parole =  {"DELFINO", "LUCCIO", "SALMONE", "BALENA", "SOGLIOLA", "CALAMARO", "GAMBERETTO", "PLATESSA", "SCORFANO", "TRIGLIA"};


    //MAIN
    public static void main(String[] args){
        //Ricerca orizzontale
        System.out.println(parole[0]+" è presente nel puzzle orizzontalmente: "+parolaPresenteNelPuzzle(puzzle, parole[0]));
        System.out.println("BAISC è presente nel puzzle orizzontalmente: "+parolaPresenteNelPuzzle(puzzle, "BAISC"));

        //Ricerca verticale
        System.out.println(parole[0]+" è presente nel puzzle verticalmente: "+parolaPresenteNelPuzzle(puzzle, parole[0]));
        System.out.println(parole[1]+" è presente nel puzzle verticalmente: "+parolaPresenteNelPuzzle(puzzle, parole[1]));

        //Ricerca diagonale (sinistra->destra) dall'alto al basso
        System.out.println("SMAF è presente nel puzzle in diagonale da sinistra verso destra dall'alto " +
                "verso il basso: "+parolaPresenteNelPuzzle(puzzle, "SMAF"));
        System.out.println("MOALFFA è presente nel puzzle in diagonale da sinistra verso destra dall'alto " +
                "verso il basso: "+parolaPresenteNelPuzzle(puzzle, "MOALFFA"));

        //Ricerca diagonale (sinistra->destra) dal basso verso l'alto
        System.out.println("LOTMLAC è presente nel puzzle in diagonale da sinistra verso destra dal basso " +
                "verso l'alto: "+parolaPresenteNelPuzzle(puzzle, "LOTMLAC"));

        //Ricerca diagonale (destra->sinistra) dall'alto verso il basso
        System.out.println("BLEUMD è presente nel puzzle in diagonale da destra verso sinistra dall'alto " +
                "verso il basso: "+parolaPresenteNelPuzzle(puzzle, "BLEUMD"));

        //Ricerca diagonale (destra->sinistra) dal basso verso l'alto
        System.out.println("MOALFFA è presente nel puzzle in diagonale da destra verso sinistra dal basso " +
                "verso l'alto: "+parolaPresenteNelPuzzle(puzzle, "MOALFFA"));
    }

    public static boolean parolaPresenteNelPuzzle(char[][] puzzle, String parola){
        boolean result = false;
        char primoCarattere = parola.charAt(0);

        outer: for(int row=0; row<puzzle.length; row++){
            for(int col=0; col<puzzle[row].length; col++){
                if(puzzle[row][col] == primoCarattere){
                    //Trovato il primo carattere, salvo la riga e la colonna dove si trova


                    //Inizio la ricerca in orizzontale da sinistra verso destra o da destra verso sinistra
                    if(parolaPresente(puzzle, parola, row, col, 0, 1) || parolaPresente(puzzle, parola, row, col, 0, -1)){
                        result = true;
                        System.out.println("Ho trovato in ORIZZONTALE");
                        break outer;
                    }


                    //Inizio la ricerca in verticale da sopra verso sotto o da sotto verso sopra
                    if(parolaPresente(puzzle, parola, row, col, 1, 0) || parolaPresente(puzzle, parola, row, col, -1, 0)){
                        result = true;
                        System.out.println("Ho trovato in VERTICALE");
                        break outer;
                    }


                    //Inizio la ricerca in diagonale da sinistra verso destra dall'alto verso il basso e viceversa
                    if(parolaPresente(puzzle, parola, row, col, 1, 1) || parolaPresente(puzzle, parola, row, col, -1, -1)){
                        result = true;
                        System.out.println("Ho trovato in DIAGONALE");
                        break outer;
                    }


                    //Inizio la ricerca in diagonale da destra verso sinistra dall'alto verso il basso e viceversa
                    if(parolaPresente(puzzle, parola, row, col, 1, -1) || parolaPresente(puzzle, parola, row, col, -1, 1)){
                        result = true;
                        System.out.println("Ho trovato in DIAGONALE INVERSA");
                        break outer;
                    }
                }
            }
        }
        return result;
    }

    public static boolean parolaPresente(char[][] puzzle, String parola, int row, int col, int incrementoRow, int incrementoCol){
        int searchRow = row;
        int searchCol = col;
        boolean tutteLeLettereTrovate = true;

        for(int indiceLettera=0; indiceLettera<parola.length(); indiceLettera++){
            //Inserisco i controlli per evitare di sforare dal puzzle in orizzontale
            if(searchRow < 0 || searchCol < 0 || searchRow >= puzzle.length || searchCol >= puzzle[searchRow].length || puzzle[searchRow][searchCol] != parola.charAt(indiceLettera)){
                tutteLeLettereTrovate = false;
            }
            searchCol += incrementoCol;
            searchRow += incrementoRow;
        }
        return tutteLeLettereTrovate;
    }
}
