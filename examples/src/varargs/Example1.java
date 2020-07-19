package varargs;

public class Example1 {

    static int sum(int... elements) {
        int result = 0;
        for (int i: elements) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4)); // 10
        System.out.println(sum(1)); // 1
        System.out.println(sum()); // 0

    }

}
