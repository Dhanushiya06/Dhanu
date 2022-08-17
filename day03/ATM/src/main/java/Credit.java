import java.util.Scanner;
public class Credit {
    public void credits() {
        System.out.println("enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Util.utilize();
        int bal = Util.balance;
        int newBalance = bal + amount;
        Util.balance = newBalance;
        System.out.println(newBalance);
    }
}
