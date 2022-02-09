import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        do{
            n = scanner.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                sum += n;
            }
            if(n % 2 == 1){
                break;
            }

        }while (n > 0);

        System.out.println("sum of even numbers :"+sum);







    }
}
