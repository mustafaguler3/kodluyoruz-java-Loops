import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int sum = 0;
        double average = 0;
        int amount = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");

        n = scanner.nextInt();

        int i = 1;
        while (i <= n){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                amount++;
            }

            i++;
        }
        average = sum / amount;
        System.out.println("Average of numbers divided by 3 and 4 are :"+average);



    }
}
