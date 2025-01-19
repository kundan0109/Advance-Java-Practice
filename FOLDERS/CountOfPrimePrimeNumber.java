package FOLDERS;

import java.util.Scanner;

public class CountOfPrimePrimeNumber {
    public static void main(String[] args) {

//        Add prime numbers till 100 in an array and print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;

        for (int end = 2; end <= n; end++) {
            boolean isPrime = true;


            for (int i = 2; i <= end / 2; i++) {

                if (end % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                count++;
                System.out.println(end + " is a prime number");
            }


        }


        System.out.println(count + " is total prime number");


    }
}
