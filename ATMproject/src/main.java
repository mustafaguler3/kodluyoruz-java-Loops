import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        while (right > 0) {
            System.out.println("Your username :");
            userName = scanner.nextLine();
            System.out.println("Your password : ");
            password = scanner.nextLine();

            if (userName.equals("mustafa") && password.equals("123")) {
                System.out.println("Hello, Welcome to coding Bank");

                System.out.println("1-Deposit\n" +
                        "2-Withdraw\n" +
                        "3-Balance\n" +
                        "4-Exit");
                System.out.print("Please select the action you want to do : ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = scanner.nextInt();
                        balance += price;
                        System.out.println("New Balance :"+balance);
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int price2 = scanner.nextInt();
                        if(price2 > balance) {
                            System.out.println("not enough balance");
                        }else {
                            balance -= price2;
                        }
                        break;
                    case 3:
                        System.out.println("Your balance :"+balance);
                        break;
                    case 4:
                        System.out.println("see you again !");
                        break;

                }
        }else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0){
                    System.out.println("Your Account Has Been Blocked. Please Contact the Coding Bank");
                }else {
                    System.out.println("remaining right : "+right);
                }
            }
    }
}}
