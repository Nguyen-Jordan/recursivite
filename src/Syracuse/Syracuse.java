package Syracuse;

import java.util.Scanner;

public class Syracuse {
    /*
    * number = x
    * while n is not equal 1
    *
    *   if n is peered
    *       n = n/2
    *   else
    *       n = 3*n + 1
    *   end if
    *   print n
    * */
    public static void syracuseCalculator(int n){

        while (n > 1){
            if (n%2 == 0){
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            System.out.println(n);
        };
    }
    public static void main (String arg[]) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate on Fibonacci methode: ");
        number = scan.nextInt();
        syracuseCalculator(number);
    }
}
