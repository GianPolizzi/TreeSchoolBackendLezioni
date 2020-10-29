package lez_8.minimum_maximum_recursive;

import java.util.Arrays;

public class MaxMin {

    private int[] arrayI;

    public MaxMin(int[] i){
        this.arrayI = i;
    }

    public int getMax(){
        return arrayI[arrayI.length-1];
    }

    public int getMin(){
        return arrayI[0];
    }

    //Algoritmo iterativo per MAX e MIN
    public void calcolaMinMaxIterativo(int[] values){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
        System.out.println("MAX = "+max);
        System.out.println("Min = "+min);
    }



    public void minMaxRicorsivo(int[] values){
        System.out.println("MAX = "+calcolaMaxRicorsivo(values, 0));
        System.out.println("MIN = "+calcolaMinRicorsivo(values, 0));
    }

    public int calcolaMaxRicorsivo(int[] values, int index){
        if(values.length-1 == index){
            return values[index];
        }
        return Math.max(values[index], calcolaMaxRicorsivo(values, index+1)) ;
    }

    public int calcolaMinRicorsivo(int[] values, int index){
        if(values.length-1 == index){
            return values[index];
        }
        return Math.min(values[index], calcolaMinRicorsivo(values, index+1)) ;
    }

}
