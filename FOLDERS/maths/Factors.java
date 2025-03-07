package FOLDERS.maths;

public class Factors {
    public static void main(String[] args) {
        int n  = 16;

        for (int i = 1; i <= n/2 ; i++) {
            if (n % i == 0)
            {
                System.out.println("Factor: " + i);
            }
        }
    }
}
