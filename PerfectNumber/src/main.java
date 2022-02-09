import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (number == sum) {
            System.out.println(number+" is perfect number .");
        }
        else {
            System.out.println(number+" is not perfect number .");
        }


    }
}
