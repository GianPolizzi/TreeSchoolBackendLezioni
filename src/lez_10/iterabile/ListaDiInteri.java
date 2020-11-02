package lez_10.iterabile;

public class ListaDiInteri implements Iterabile, Lista {

    private int[] array;
    private Integer[] listaInteri;
    private int count = 0;
    private int capacitàArray = 10;

    public ListaDiInteri(int[] lista){
        this.array = lista;
    }

    public ListaDiInteri(){
        listaInteri = new Integer[capacitàArray];
    }

    public int[] getListaInteri(){
        return array;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return getListaInteri()[count++];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return count < array.length;
    }

    @Override
    public void reset() {
        count = 0;
    }


    //SECONDA PARTE


    @Override
    public Object get(int i) {
        return listaInteri[i];
    }

    @Override
    public boolean contains(Object o) {
        if(listaInteri.length>0){
            for(Integer elemento : listaInteri){
                if(elemento == (Integer) o){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        return listaInteri.length;
    }

    @Override
    public void add(Object o) {
        if(capacitàArray == 0){
            System.out.println("IMPOSSIBILE INSERIRE ELEMENTO!");
            System.out.println("Hai esaurito lo spazio disponibile nell'array!");
        }
        else{
            for(int i=0; i<listaInteri.length; i++){
                if(listaInteri[i] == null){
                    listaInteri[i] = (Integer) o;
                    System.out.println("Elemento inserito!");
                    capacitàArray--;
                    break;
                }
            }
        }
        System.out.println("Numero spazi liberi = "+capacitàArray);
    }

    @Override
    public boolean remove(int i) {
        if(capacitàArray == 10){
            System.out.println("Non è presente nessun elemento nella lista da eliminare!");
            return false;
        }
        else{
            listaInteri[i] = null;
            System.out.println("Elemento rimosso!");
            capacitàArray++;
            for(int j=i; j<listaInteri.length-1; j++){
                //Ne guardo uno in meno perchè altrimenti vado in errore
                listaInteri[j] = listaInteri[j+1];
            }
            return true;
        }
    }

    @Override
    public void clear() {
        for (int i=0; i<listaInteri.length; i++){
            listaInteri[i] = null;
        }
        System.out.println("Ho svuotato la lista!");
    }
}
