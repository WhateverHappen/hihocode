package offset;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/4/28.
 */
///计算最大连续打卡天数
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();        ///测试数据的组数
        for(int i=0;i<num;i++){
            int day = scanner.nextInt();        ///缺少的天数
            int card = scanner.nextInt();       ///补交卡数

            int[] days = new int[day];          ///储存缺少打卡的天数
            for (int j = 0; j < day; j++) {
                days[j] = scanner.nextInt();
            }

            if(card>=day){              ///补交卡数大于等于缺少的天数，最多100天
                System.out.println("100");
                continue;
            }else {         ///补交卡数小于缺少的天数，比较获得最大收益
                int result=days[card]-1;           ///最大连续天数
                for(int j=card+1;j<days.length;j++){
                    if(days[j]-days[j-card-1]-1>result){
                        result = days[j]-days[j-card-1]-1;
                    }
                }
                System.out.println(result);
            }
        }
    }
}
