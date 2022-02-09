import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("take a number from input : ");
        int number = scanner.nextInt();

        //which prints powers of 4 and 5 up to the entered number.

        for(int i = 1;i<=number;i*=4){
            System.out.println(i);
        }

        for(int i = 1;i<=number;i*=5){
            System.out.println(i);
        }







    }
}
