package lez_4;

public class NumeriPerfetti {

    public static void main(String[] args) {
        int check;

        for(int i=1; i<=1000; i++){
            check = 0;
            for(int k=1; k<=i/2; k++){
                if(i%k == 0){
                    check += k;
                }
            }
            if(check == i){
                System.out.println("I numeri perfetti su 1000 sono "+check);
            }
        }

    }

}
