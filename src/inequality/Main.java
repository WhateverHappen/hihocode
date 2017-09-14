package inequality;

import java.util.Scanner;

/**
 * Created by thanatos on 2017/5/16.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        int num = scanner.nextInt();
        String[] operator = new String[num];
        int[] number = new int[num];

        for (int i = 0; i < num; i++) {
            String foo = scanner.next();          ///X
            operator[i] = scanner.next();         ///判断符
            number[i] = Integer.valueOf(scanner.next());      ///判断式子
        }

        for (int i = -1; i <= 1001; i++) {
            int temp = 0;
            for (int j = 0; j < num; j++) {

                if ((operator[j].equals("=")) && (i == number[j]))
                    temp++;
                else if ((operator[j].equals(">=")) && (i >= number[j]))
                    temp++;
                else if ((operator[j].equals(">")) && (i > number[j]))
                    temp++;
                else if ((operator[j].equals("<=")) && (i <= number[j]))
                    temp++;
                else if ((operator[j].equals("<")) && (i < number[j]))
                    temp++;
            }
            if (temp > max)
                max = temp;
        }

        System.out.println(max);
    }
}
