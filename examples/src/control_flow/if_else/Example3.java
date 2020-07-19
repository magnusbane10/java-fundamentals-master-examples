package control_flow.if_else;

public class Example3 {

    public static void main(String[] args) {

        int age = 35;

        if (age < 18) {
            System.out.println("You are teenager!");
        } else if (age > 100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }

    }

}
