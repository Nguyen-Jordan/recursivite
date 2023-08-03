package Factor;

import java.util.Scanner;

public class Factor {

    /*
    * Pseudo Code:
    * number = x
    * If number is equal to 0 or 1
    * result is 1
    * else
    * return number * number-1 and verify the same condition
    * */
    public static int factorCalculator(int n){
        if ( n == 0 || n == 1){
            return 1;
        } else {
            return n * factorCalculator(n-1);
        }
    }

    public static void main (String arg[]) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to factorise: ");
        number = scan.nextInt();
        System.out.println(factorCalculator(number));
    }
}
