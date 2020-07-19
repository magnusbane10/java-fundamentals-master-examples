package input_output.basic_output;

public class Example3 {

    public static void main(String[] args) {

        System.out.println("printl prints a line and moves to the next one");
        System.out.print("print prints a line but doesn't move to the next line, so we have to add newline\n");

        String sentence = "but gives the possibility to pass additional text";
        System.out.printf("printf works like a print %s\n", sentence);
        int decimalValue = 10;
        System.out.printf("...or decimal values: %d\n", decimalValue);
        double floatingPointValue = 15.12514;
        System.out.printf("...or rounded floating point values: %.2f\n", floatingPointValue);
        String otherSentence = "dynamically!";
        System.out.printf("...or everything together: %d %.2f %s\n", decimalValue, floatingPointValue, otherSentence);

    }

}
