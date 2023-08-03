package Syracuse;

import java.util.Scanner;

public class Syracuse {
    /*
    * number = x
    * if number is equal 1
    *   print 1
    * else
    *   print number
    *   if number is peered
    *       number = number/2
    *   else
    *       number = 3*number + 1
    *   end if
    *   reverse conditions with number
    * end if
    * */
    public static int syracuseCalculator(int n){


        if (n == 1){
            return 1;
        } else {
            System.out.println(n);
            if (n%2 == 0){
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            return syracuseCalculator(n);
        }
    }
    public static void main (String arg[]) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate on Fibonacci methode: ");
        number = scan.nextInt();
        System.out.println(syracuseCalculator(number));
    }
}
