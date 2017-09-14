package eliminate;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/4/29.
 */
///消除相同字符
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();        ///测试数据量

        for (int i = 0; i < num; i++) {
            StringBuffer buffer = new StringBuffer(scanner.next());
            int min = buffer.length();
            for (int j = 0; j < buffer.length(); j++) {
                for (char ch = 'A'; ch <= 'C'; ch++) {        ///从“A”到“C”挨个插入比较
                    StringBuffer temp = new StringBuffer(buffer);
                    temp = temp.insert(j, ch);         ///插入字符
                    int count = eliminate(temp);    ///计算分数
                    min = min > count ? count : min;
                }
            }
            System.out.println(buffer.length() - min + 1);
        }
    }

    private static int eliminate(StringBuffer buffer) {
        int count = 0;
        while (true) {
            StringBuffer temp = new StringBuffer();
            int j = 1;
            int i = 0;
            for (; j < buffer.length(); j++) {
                if (buffer.charAt(i) != buffer.charAt(j)) {     ///两个字符不等
                    temp.append(buffer.charAt(i));    ///将前一个字符存入临时变量
                } else {
                    while (j < buffer.length() && buffer.charAt(i) == buffer.charAt(j)) { ///两个字符相等
                        j++;
                    }
                }
                i = j;    ///将指针放置到字符不等的位置，以便进行下一次消除
            }
            if (j == buffer.length()) {
                temp.append(buffer.charAt(i));        ///放入最后一个字符
            }
            if (temp.length() == buffer.length()) {
                count = temp.length();
                break;
            }
            buffer = temp;
        }
        return count;
    }
}
