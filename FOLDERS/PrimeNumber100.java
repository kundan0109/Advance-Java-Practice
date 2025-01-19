package FOLDERS;

import java.util.Scanner;

public class PrimeNumber100 {
    public static void main(String[] args) {

//        Add prime numbers till 100 in an array and print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int end = 1; end <= n; end++) {
            boolean isPrime = true;


            for (int i = 2; i <= end / 2; i++) {

                if (end % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(end + " is Prime number");
            } else {
//                System.out.println(end + " is Not Prime number");
            }

        }




    }
}
