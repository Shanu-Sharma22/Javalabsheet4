public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sneha Verma", 1000);
        acc.display();
        acc.deposit(2500);   // valid
        acc.deposit(-300);   // rejected by validation
        acc.deposit(0);      // rejected by validation
        acc.display();
    }
}
