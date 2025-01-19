package FOLDERS;

import java.util.Scanner;

public class FactorialOfNumbersTill_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        long n = sc.nextInt();

        for (long number = 1; number <= n; number++) {
            long fact = 1;
            for (long i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of no "+ number +" is  " + fact);
        }
    }
}






