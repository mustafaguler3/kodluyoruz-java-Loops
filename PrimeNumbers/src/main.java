public class main {
    public static void main(String[] args) {

        int number;

        boolean isPrime = false;

        for (number = 2; number <= 100; number++) {
            isPrime = false;
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime){
                System.out.print(number + " ");
            }

        }


        }
    }

