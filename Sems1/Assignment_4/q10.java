package Sems1.Assignment_4;
/* Write a java program to print largest power of three less than or equal to N.
Sample run:
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81 */

import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = 1;
        while (result <= n) {
            result *= 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + (result / 3));
        input.close();
    }
}
