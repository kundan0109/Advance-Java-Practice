package FOLDERS;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = sc.nextInt();
        int fact = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                fact = fact + i;
            }
        }

        if (fact == n) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
