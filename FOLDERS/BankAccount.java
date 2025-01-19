package FOLDERS;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    // Static login method
    public static boolean login(String username, String password) {
        // Check username and password against a database (dummy logic here)
        if ("user123".equals(username) && "password123".equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    // Instance method
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        // Static method call
        BankAccount.login("user123", "password123"); // No object needed

        // Creating objects
        BankAccount acc1 = new BankAccount("John Doe", "12345");
        BankAccount acc2 = new BankAccount("Jane Doe", "67890");

        // Display account details for specific objects
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
