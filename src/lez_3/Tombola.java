package lez_3;

public class Tombola {

    public static void main(String[] args){
        int[][] matrice = {
                {9, 27, 55, 78, 83},
                {11, 39, 57, 73, 85},
                {5, 18, 34, 41, 62}
        };
        int[] estrazione = {9, 27, 54, 77, 83, 11, 39, 57, 73, 85, 5, 18, 34, 41, 61};
        int[] trovato = trova(matrice, estrazione);
        stampa(trovato);

    }

    public static void stampa(int[] trovato){
        if(trovato[0] != 0)
            if (trovato[0] == 1) {
                System.out.println("Hai fatto " + trovato[0] + " ambo!");
            } else {
                System.out.println("Hai fatto " + trovato[0] + " ambi!");
            }
        if(trovato[1] != 0)
            if (trovato[1] == 1) {
                System.out.println("Hai fatto " + trovato[1] + " terna!");
            } else {
                System.out.println("Hai fatto " + trovato[1] + " terne!");
            }
        if(trovato[2] != 0)
            if (trovato[2] == 1) {
                System.out.println("Hai fatto " + trovato[2] + " quaterna!");
            } else {
                System.out.println("Hai fatto " + trovato[2] + " quaterne!");
            }
        if(trovato[3] != 0)
            if (trovato[3] == 1) {
                System.out.println("Hai fatto " + trovato[3] + " cinquina!");
            } else {
                System.out.println("Hai fatto " + trovato[3] + " cinquine!");
            }
        if(trovato[4] != 0)
            System.out.println("HAI FATTO TOMBOLA!");
    }

    public static int[] trova(int[][] matrix, int[] estrazione){
        int conta = 0;
        int ambo = 0;
        int terne = 0;
        int quaterne = 0;
        int cinquine = 0;
        int tombola = 0;

        int[] risultati = new int[5];
        for(int k = 0; k<matrix.length; k++){
            for(int j = 0; j<matrix[0].length; j++)
                for(int i = 0; i<estrazione.length; i++)
                    if(matrix[k][j] == estrazione[i])
                        conta++;

            switch (conta){
                case 5:
                    cinquine++;
                    break;
                case 4:
                    quaterne++;
                    break;
                case 3:
                    terne++;
                    break;
                case 2:
                    ambo++;
                    break;
            }

            conta = 0;
        }

        if(cinquine == 3){
            tombola = 1;
            cinquine = 0;
        }

        risultati[0] = ambo;
        risultati[1] = terne;
        risultati[2] = quaterne;
        risultati[3] = cinquine;
        risultati[4] = tombola;

        return risultati;
    }
}