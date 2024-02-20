import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        int multiply = num1 * num2;


        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + multiply);

        }
    }
