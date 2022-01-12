package lez_10.lambda;

public class RunnableTest {

    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello world classic!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world Lambda!");

        r1.run();
        r2.run();
    }
}
