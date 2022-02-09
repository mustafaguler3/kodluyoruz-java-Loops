import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many number do you want to enter? ");
        int number=scanner.nextInt();
        int first = 0;
        int second = 1;
        int third = first + second;

        System.out.println("Fibonacci numbers :");
        System.out.print(first+ " "+second+ " ");

        while(number>0){
            System.out.print(third+ " ");
            number--;
            first = second;
            second = third;
            third = first + second;
        }






    }
}
