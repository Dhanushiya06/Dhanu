import java.util.Scanner;

public class Calculation {

    public int  add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a nd b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return (a+b);

    }

     public int sub() {
        Scanner scanner=new Scanner(System.in);
         System.out.println("a nd b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return ( a-b);
    }

      public int mul() {
        Scanner scanner=new Scanner(System.in);
          System.out.println("a nd b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return ( a * b);
    }

     public int divide() {
        Scanner scanner=new Scanner(System.in);
         System.out.println("a nd b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return (a /b);
    }

    public  int modulus() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a nd b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return ( a % b);
    }
}
