import java.util.Scanner;

public class April5th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int number;

        while (choice != 0) {
            System.out.println("Enter your number");
            number = sc.nextInt();
            System.out.println("1.Check prime number");
            System.out.println("2.Check even or odd");
            System.out.println("3.Check square number");
            System.out.println("0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    int count = 0;
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("This is prime number");
                    } else {
                        System.out.println("This is not prime number");
                    }
                    break;
                }
                case 2: {

                    if (number % 2 == 0) {
                        System.out.println("This is even number");
                    } else {
                        System.out.println("This is odd number");
                    }
                    break;
                }
                case 3: {

                    double check = Math.sqrt(number);
                    if (check * check == number) {
                        System.out.println("This is square number");
                    } else {
                        System.out.println("This is not square number");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        }
    }
}
