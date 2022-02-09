import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int n,r,a=1,b=1,c=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        n = scanner.nextInt();
        System.out.println("Enter second number :");
        r = scanner.nextInt();

        for (int i =1; i <= n; i++){
            a *=i;
        }

        for (int i =1; i <= r; i++){
            b *=i;
        }

        for (int i =1; i <= n-r; i++){
            c *=i;
        }

        int comb = a / (b*c);
        System.out.println(comb);

    }
}
