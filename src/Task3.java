//finished
import java.util.Scanner;
public class Task3 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        double goal;
        System.out.println("Enter your savings goal.");
        goal=scan.nextDouble();

        int timesDeposited=1;
        double deposits=0;
        double total=0;
        double extra=0;
        do{
            System.out.println("Enter deposit "+ timesDeposited);
            if (scan.hasNextDouble()) {
                if (deposits>= 0) {
                    deposits = scan.nextDouble();
                    total=total+deposits;
                    timesDeposited++;
                } else {
                    System.out.println("Error, enter postive number");
                }
            } else {
                System.out.println("Error, enter valid number");
                scan.nextLine();
            }
        }while(goal>total);

        extra=total-goal;

        System.out.println("You entered "+ timesDeposited+ " deposites.");
        System.out.println("You have $"+ total+" amount of money");
        System.out.println("You have $"+extra+" surplus");
    }
}
