import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        int ebob = 1;

        int i= 1;
        while (i <= num1){
            if(num1 % i == 0 && num2 % i == 0){
                ebob = i;
                System.out.println("Ebob : "+ebob);
            }
         i++;
        }

        int j = 1;
        while (j <= (num1*num2)){
            if(j % num1 == 0 && j % num2 == 0){
                System.out.print(" Ekok : "+j);
                break;
            }
            j++;
        }









    }
}
