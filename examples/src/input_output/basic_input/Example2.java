package input_output.basic_input;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("I can add two values of type int!");
        System.out.println("Write first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Write second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Sum of your values is: " + (firstValue + secondValue));

    }

}
