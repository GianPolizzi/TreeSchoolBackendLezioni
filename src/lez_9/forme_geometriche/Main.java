package lez_9.forme_geometriche;

public class Main {

    public static void main(String[] args){

        Quadrato q1 = new Quadrato(5);
        System.out.println("Perimetro = "+q1.getPerimetro());
        System.out.println("Area = "+q1.getArea());
        System.out.println(q1.toString());

        Rettangolo r1 = new Rettangolo(5,6);
        System.out.println("Perimetro = "+r1.getPerimetro());
        System.out.println("Area = "+r1.getArea());
        System.out.println(r1.toString());
    }
}
