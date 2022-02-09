import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int number,n,max=0,min=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("write number iterating over loop : ");
        n = scanner.nextInt();

        for (int i = 1; i <=n; i++){

            System.out.print(i + ". number: ");
            number = scanner.nextInt();

            if (i == 1){
                min=number;
                max=number;
            }
            else {
                if (number>max) {
                    max=number;
                }
                if (number<min) {
                    min=number;
                }
            }
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }



    }

