package FOLDERS;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println( n + " is Prime number");
        }
        else {
            System.out.println( n + " is Not Prime number");
        }

    }
}
