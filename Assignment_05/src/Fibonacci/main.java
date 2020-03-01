
package Fibonacci;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        fibonacci fibo = new fibonacci();
        fibo.fibonacci(number);    
    }
}
