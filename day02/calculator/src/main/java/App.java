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
                calculation.add(5,8);
                break;
                case(2):
                    calculation.sub(2,5);
                    break;
            case(3):
                calculation.mul(2,3);
                break;
            case(4):
                calculation.div(6,3);
                break;
         }
    }
}
