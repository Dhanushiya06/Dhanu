import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n,x,y;
        System.out.println("1.ADD" +
                " 2.SUB" +
                " 3.MUL" +
                " 4.DIVIDE");

        System.out.println("enter the no: ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        
        Calculation calculation = new Calculation();

        switch(n){
            case(1):
                System.out.println(calculation.add());
                break;
                case(2):
                    System.out.println(calculation.sub());
                    break;
            case(3):
                System.out.println(calculation.mul());
                break;
            case(4):
                System.out.println(calculation.div());
                break;
         }
    }
}
