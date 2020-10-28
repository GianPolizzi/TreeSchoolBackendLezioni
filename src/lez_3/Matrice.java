package lez_3;

public class Matrice {

    //Definisco una matrice statica
    static int[][] matrice = {
            {1, 7, 0, -1},
            {-1, 3, 8, 5},
            {2, 0, -2, 4},
            {6, 1, 5, 9}
    };

    public static void main(String[] args){
        Matrice matrix = new Matrice();
        matrix.stampaMatrice(4, 4);
        matrix.calcolaDiagonaleMaggiore(matrice);
        matrix.calcolaDiagonaleMinore(matrice);
    }

    private void stampaMatrice(int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("Elemento ["+i+"]["+j+"] = "+matrice[i][j]);
            }
        }
    }

    private void calcolaDiagonaleMaggiore(int[][] m){
        int somma = 0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(i == j){
                    somma = somma + matrice[i][j];
                }
            }
        }
        System.out.println("La somma della diagonale maggiore è "+somma);
    }

    private void calcolaDiagonaleMinore(int[][] m){
        for(int i=0; i<m.length; i++){
             for(int j=m[i].length-1;j>0;j--){
                //m[i][j] = matrice[j][i];
                System.out.println("Elemento ["+i+"]["+j+"] = "+m[i][j]);

            }
        }
    }



}
