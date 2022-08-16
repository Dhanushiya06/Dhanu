import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displaymenu();
        System.out.println("enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Calculation calculation = new Calculation();
        if (choice > 0 && choice <= 5) {
            switch (choice) {
                case (1):
                    System.out.println("result: "+calculation.add());
                    break;
                case (2):
                    System.out.println("result: "+calculation.sub());
                    break;
                case (3):
                    System.out.println("result: "+calculation.mul());
                    break;
                case (4):
                    System.out.println("result: "+calculation.divide());
                    break;
                case (5):
                    System.out.println("result: "+calculation.modulus());
                    break;
            }
        }
            else{
                    System.out.println("error");
                }

        }

    }