package FOLDERS;

public class Star05 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 6 - i; j++) {
                if (j % 2 == 0) {
                    System.out.print(" " + "0");
                } else {
                    System.out.print(" " + "1");
                }
            }
            System.out.println();
        }
    }
}
