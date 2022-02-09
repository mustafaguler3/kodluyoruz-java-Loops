import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i =1; i <= n;i++){
            sum += (1/i);
        }
        System.out.print(" "+sum);




    }
}
