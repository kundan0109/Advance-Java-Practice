package FOLDERS;

public class BankAccount02 {
    private String username;
    private String password;

    // Constructor
    public BankAccount02(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Instance login method
    public boolean login(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Login successful for user: " + username);
            return true;
        }
        System.out.println("Invalid credentials for user: " + inputUsername);
        return false;
    }

    public static void main(String[] args) {
        // Creating instances
        BankAccount02 acc1 = new BankAccount02("user1", "pass1");
        BankAccount02 acc2 = new BankAccount02("user2", "pass2");

        // Instance method calls
        acc1.login("user1", "pass1"); // Valid login for acc1
        acc2.login("user1", "pass1"); // Invalid login for acc2
    }
}
