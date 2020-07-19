package strings;

public class Example1 {

    public static void main(String[] args) {

        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

    }

}
