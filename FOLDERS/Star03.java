package FOLDERS;

public class Star03 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" " + "*" );
            }
            System.out.println();
        }
    }
}
