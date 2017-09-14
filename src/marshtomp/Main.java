package marshtomp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 嘲讽脸 on 2017/4/29.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            StringBuffer buffer = new StringBuffer(scanner.nextLine());
            String reg = "(m|M)(a|A)(r|R)(s|S)(h|H)(t|T)(o|O)(m|M)(p|P)";

            Pattern pattern = Pattern.compile(reg);
            String string = "fjxmlhx";
            Matcher matcher = pattern.matcher(buffer);
            System.out.println(matcher.replaceAll(string));
        }
    }
}

