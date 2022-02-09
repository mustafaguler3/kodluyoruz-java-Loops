import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in) ;
        int val=1;
        System.out.println("Enter numbers.");
        System.out.print("Number 1: ");

        int number = scanner.nextInt();

        System.out.print("Exponential: ");

        int exponential = scanner.nextInt();

        for (int i=1; i<=exponential;i++) {
            val = number*val;
        }

        System.out.print(+number+"^"+exponential+ ": " +val);


    }
}
