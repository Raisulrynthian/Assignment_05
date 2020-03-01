package Fibonacci;

public class fibonacci {

    public void fibonacci(int number) {
        int a = 0, b = 1, c = 0;
        while (number >= 1) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            number-=1;
        }
    }
}
