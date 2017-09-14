package test;

import java.util.Scanner;

/**
 * Created by 嘲讽脸 on 2017/5/2.
 */
public class ScannerTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a-b);      ///当使用逗号时不能连续取两个整数
    }
}
