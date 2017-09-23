package test;

import java.util.Arrays;

/**
 * Created by thanatos on 2017/9/23.
 */
public class ArraysSortTest {       //无法排序多维数组
    public static void main(String[] args){
        int[][] temp={{3,5,1},{1,3,7},{2,5,6}};
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[1].length;j++){
                System.out.println(temp[i][j]);
            }
        }
    }
}
