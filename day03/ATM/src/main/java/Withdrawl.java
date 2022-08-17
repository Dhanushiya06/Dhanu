import java.util.Scanner;

public class Withdrawl {
    public void withdraw() {
        System.out.println("enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Util.utilize();
        int bal = Util.balance;
        if (amount <= bal) {
            int newBalance = bal - amount;
            Util.balance = newBalance;
            System.out.println(newBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

