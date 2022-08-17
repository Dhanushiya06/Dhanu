import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ATM");
        Menu menuObj = new Menu();
        menuObj.displayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select Option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    Withdrawl withdrawl = new Withdrawl();
                    withdrawl.withdraw();
                    break;
                }
                case 2: {
                    Credit credit = new Credit();
                    credit.credits();
                    break;
                }
                case 3: {
                    ViewBalance viewbalance = new ViewBalance();
                    viewbalance.balance();
                    break;
                }
                case 4:{
                    System.out.println("Thank you..");
                    System.exit(0);
                }
            }
            menuObj.displayList();
        }
    }
}

