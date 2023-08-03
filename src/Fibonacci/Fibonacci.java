package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    /*
    * Pseudo Code:
    * number = x
    * Set Variables a=0, b=1
    * for i value 2 to n
    * c = a+b
    * print c
    * a = b
    * b = c
    * */
    public static void fibonacciCalculator(int n) {

        int a = 0;
        int b = 1;
        int c;
        int i;
        for (i=2; i < n; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

    public static void main (String arg[]) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate on Fibonacci methode: ");
        number = scan.nextInt();
        fibonacciCalculator(number);
    }
}
