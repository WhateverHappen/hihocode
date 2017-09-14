package rename;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/4/25.
 */
///重新命名变量
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] list = new String[num];
        int index1 = 0;
        while (index1 < num) {
            list[index1] = scanner.next();
            index1++;
        }
        // 风格转换
        for (int i = 0; i < list.length; i++) {
            char[] name = list[i].toCharArray();
            char[] temp = new char[300];

            int nameLength=name.length;

            for (int j = 0, k = 0; j < name.length; j++, k++) {
                if (name[j] == '_') {       /// 含有“_”，snake case
                    temp[k] = Character.toUpperCase(name[j + 1]);
                    j++;
                    nameLength--;
                } else if ('A' <= name[j] && name[j] <= 'Z') {  ///含有大写字母，camelCase
                    temp[k] = '_';
                    temp[k + 1] = Character.toLowerCase(name[j]);
                    k++;
                    nameLength++;
                } else {
                    temp[k] = name[j];
                }
            }

            char[] result=new char[nameLength];
            for(int j=0;j<nameLength;j++){
                result[j]=temp[j];
            }
            System.out.println(result);
        }
    }
}

