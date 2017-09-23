package buySnack;

import java.util.Scanner;

/**
 * Created by thanatos on 2017/9/23.
 */
public class Main {
    private static final int MAXN = 55;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNum = scanner.nextInt();       //测试组数
        double[] price = new double[MAXN];
        int[] value = new int[MAXN];

        for (int i = 0; i < groupNum; i++) {            //每组测试都要输出结果
            int snackNum = scanner.nextInt();       //小吃数量
            for (int j = 0; j < snackNum; j++) {        //遍历小吃信息，存储到数组中
                price[j] = scanner.nextDouble() * 10;   //价格
                value[j] = scanner.nextInt();      //渴望值
            }
            FindMax findMax = new FindMax();
            int result = findMax.calculateValue(price, value, snackNum);      //计算最大渴望和
            System.out.println(result);
        }
    }
}

class FindMax {
    int calculateValue(double[] price, int[] value, int snackNum) {
        int result = 0;
        for (int i = 0; i < snackNum; i++) {
            if (price[i] % 50 == 0) {
                result = max(result, value[i]);
            }
        }
        for (int i = 0; i < snackNum; i++) {
            for (int j = i + 1; j < snackNum; j++) {
                if ((price[i] + price[j]) % 50 == 0) {
                    result = max(result, value[i] + value[j]);
                }
            }
        }
        for (int i = 0; i < snackNum; i++) {
            for (int j = i + 1; j < snackNum; j++) {
                for (int k = j + 1; k < snackNum; k++) {
                    if ((price[i] + price[j] + price[k]) % 50 == 0) {
                        result = max(result, value[i] + value[j] + value[k]);
                    }
                }
            }
        }
        return result;
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }
}