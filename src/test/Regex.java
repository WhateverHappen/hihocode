package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 嘲讽脸 on 2017/4/29.
 */
public class Regex {
    public static void main(String args[]){
//        String str1 = "1 2 3          4 54       5 6";
//        String[] numbers = str1.split(" +");
//        for (String temp : numbers) {
//            System.out.println(temp);
//        }
//
//        // 替换，替换所有的数字为*
//        String str2 = "abd123:adad46587:asdadasadsfgi#%^^9090";
//        System.out.println(str2.replaceAll("[0-9]", "*"));
//        System.out.println(str2.replaceAll("\\d", "*"));
//
//        // 匹配匹配邮箱
//        String mail1 = "ababc@asa.com";
//        String mail2 = "ababc@asa.com.cn";
//        String mail3 = "ababc@asa";
//        //        String mainRegex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]++(\\.[0-9a-zA-Z_]+{2,4})+";
//        String mainRegex = "\\w+@\\w+(\\.\\w{2,4})+";
//
//        System.out.println(mail1.matches(mainRegex));//true
//        System.out.println(mail2.matches(mainRegex));//true
//        System.out.println(mail3.matches(mainRegex));//false
//
//        String str = "abc 124 ewqeq qeqe   qeqe   qeqe  aaaa  fs fsdfs d    sf sf sf  sf sfada dss dee ad a f s f sa a'lfsd;'l";
//        Pattern pt = Pattern.compile("\\b\\w{3}\\b");
//        Matcher match = pt.matcher(str);
//        while (match.find()) {
//            System.out.println(match.group());
//        }

        String sr = "dada ada adad adsda ad asdda adr3 fas daf fas fdsf 234 adda";
        //包含两个匹配组，一个是三个字符，一个是匹配四个字符
        Pattern pet = Pattern.compile("\\b(\\w{3}) *(\\w{4})\\b");
        Matcher match = pet.matcher(sr);
        int countAll = match.groupCount();//2
        while (match.find()) {
            System.out.print("匹配组结果：");
            for (int i = 0; i < countAll; i++) {
                System.out.print(String.format("\n\t第%s组的结果是:%s",i+1,match.group(i + 1)));
            }
            System.out.print("\n匹配的整个结果:");
            System.out.println(match.group());
        }
    }
}
