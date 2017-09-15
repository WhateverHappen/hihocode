package numberAdd;

import java.util.Scanner;

/**
 * Created by thanatos on 2017/9/15.
 */
public class NumberAdd {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a+b);
        }
    }
}
