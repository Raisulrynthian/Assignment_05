package Fibonacci;

public class fibonacci {

    public void fibonacci(int number) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " "+ b +" ");
        while (number >= 1) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            number -= 1;
        }
    }
}
