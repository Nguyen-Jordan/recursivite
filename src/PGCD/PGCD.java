package PGCD;

import java.util.Scanner;

public class PGCD {
    /*
    * Pseudo Code:
    * number1 = x
    * number2 = y
    * if number2 == 0
    *   print number1
    * else
    *   numberModulo = number1 modulo number2
    *   numberResult = number2 modulo numberModulo
    *   print numberResult
    * end if
    *
    * */
    public static int pgcdCalculator(int n1, int n2) {
        if (n2 == 0){
            return n1;
        } else {
            int nR = n1%n2;
            return pgcdCalculator(n2, nR);
        }
    }
    public static void main (String arg[]) {
        int number1;
        int number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number to calculate: ");
        number1 = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second number to calculate: ");
        number2 = scan2.nextInt();
        System.out.println(pgcdCalculator(number1, number2));
    }
}
