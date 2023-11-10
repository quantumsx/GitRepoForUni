import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //Scanner sc = new Scanner(System.in); Про ввод не совсем понял как реализовать нужно
        //fib(sc.nextInt()); // Это если пользователь вводит

        fib(10); // Это если хардкод

    }

    public static void fib(int n) {
        int a = 0, b = 1, c;
        System.out.println(0);

        for (int i = 2; i <= n; i++) {
            c = a;
            a += b;
            b = c;
            System.out.println(a);
        }
    }
}



