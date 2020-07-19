package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches(".t", "dt")); // true
        System.out.println(Pattern.matches(".d", "odt")); // false
        System.out.println(Pattern.matches(".d", "oodt")); // false
        System.out.println(Pattern.matches("..t", "odt")); // true
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        System.out.println(m.matches()); // true

    }

}
