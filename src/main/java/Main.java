import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //Scanner sc = new Scanner(System.in); Про ввод не совсем понял как реализовать нужно
        //fib(sc.nextInt()); // Это если пользователь вводит

        System.out.println(fib(10)); // Это если хардкод

    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}



