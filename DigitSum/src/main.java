import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int count=0;

        while (number!=0) {
            int  remainder = number % 10;
            sum += remainder;
            number = number / 10 ;
            count++;
        }

        System.out.println("digit count : "+count);
        System.out.println("sum of digit value : "+sum);



    }
}
