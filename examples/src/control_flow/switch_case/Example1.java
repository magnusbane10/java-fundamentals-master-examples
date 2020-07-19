package control_flow.switch_case;

public class Example1 {

    public static void main(String[] args) {

        char direction = 'w';

        switch (direction) {
            case 'n':
                System.out.println("You are going North!");
                break;
            case 's':
                System.out.println("You are going South!");
                break;
            case 'e':
                System.out.println("You are going East!");
                break;
            case 'w':
                System.out.println("You are going West!");
                break;
            default:
                System.out.println("Bad direction!");
        }

    }

}
