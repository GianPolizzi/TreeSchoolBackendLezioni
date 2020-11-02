package lez_10.iterabile;

public class MiaStringa implements Iterabile {

    private final String stringa;
    private int count = 0;

    public MiaStringa(String s){
        this.stringa = s;
    }

    public String getStringa() {
        return stringa;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return getStringa().charAt(count++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return count < stringa.length();
    }

    @Override
    public void reset() {
        this.count = 0;
    }
}
