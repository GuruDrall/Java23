package FxnPractice;

import java.util.Scanner;

public class SumOfOddNums {

    public static void SumofOddNum(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to " + n + " is : " + sum);
        return;
    }

    public static void main(String[] args) {

        // ! 2. Write a function to print the sum of all odd numbers from 1 to n.
        System.out.println("Enter the number n to find the sum of all odd numbers from 1 to n");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumofOddNum(n);
    }

}
