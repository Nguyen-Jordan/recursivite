package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    /*
    * Pseudo Code:
    * number = x
    * for i to number
    * if i is equal 0
    *   print 0
    * end if
    * if i is equal 1 or 2
    *   print 1
    * end if
    *   repeat process conditions with i-2 and n-1 and add it
    * end for
    * */
    public static int fibonacciCalculator(int n) {

        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacciCalculator(n-2) + fibonacciCalculator(n-1);
    }

    public static void main (String arg[]) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate on Fibonacci methode: ");
        number = scan.nextInt();
        for (int i=0; i<number; i++){
            System.out.println(fibonacciCalculator(i));
        }
    }
}
