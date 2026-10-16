import java.util.Scanner;
public class Task2 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        int terms = 0;
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        //        int adding; //unsure if needed
        boolean done = false;

        System.out.println("Enter number of terms you want");
        do {
            if (scan.hasNextInt()) {
                terms = scan.nextInt();
                if (terms > 0&&terms<47) {
                    done = true;
                } else {
                    System.out.println("Error, enter postive number of terms and less than 47 or over load");
                }
            } else {
                System.out.println("Error, you must have number.");
                scan.nextLine();
            }
        } while (!done);
        System.out.print(number1 + " " + number2+" ");
        for (int i = 2; i < terms; i++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2= number3;
        }
    }
}
