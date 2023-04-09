package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner scanner = new Scanner(System.in);
        int inp;

        System.out.println("Enter a number: ");
        inp = Integer.parseInt(scanner.nextLine());

        System.out.println("The result is: " + getFactorialForLoop(inp));


    }

    public static int getFactorialForLoop(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
        else {
            System.out.println("n has to be positive");
            return result;
        }

    }
}
