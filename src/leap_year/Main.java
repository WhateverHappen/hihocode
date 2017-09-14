package leap_year;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/5/2.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();        ///测试组数

        for (int i = 0; i < num; i++) {
            String month1 = scanner.next();         ///获得月份
            ///去除逗号，获得天数
            String temp = scanner.next();
            int day1 = Integer.valueOf(temp.split(",")[0]);
            int year1 = scanner.nextInt();      ///获得年份
            int num1 = calNum(day1,year1,month1);

            String month2 = scanner.next();
            temp = scanner.next();
            int day2 = Integer.valueOf(temp.split(",")[0]);
            int year2 = scanner.nextInt();      ///获得年份
            int num2 = calNum(day2,year2,month2);

            int result = num2-num1;
            if(leapYear(year1)&&(month1.equals("February")&&day1==29))
                result++;
            System.out.println("Case #" + (i + 1) + ": " + result);
        }
    }

    private static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int calNum(int day,int year, String month){
        int num = year / 4 + year / 400 - year / 100;
        if(leapYear(year)&&(month.equals("January")||(month.equals("February")&&day<29))){
            num--;
        }
        return num;
    }

}


