package WorkStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonSolution {
    /*编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。
     */
    public static void main(String[] args) {
//        String str1 = "flower";
//        String str2 = "flow";
//        String str3 = "flight";
        //判断两个数组是否相等
        int[] arg1 = {1,2,3,4};
        int[] arg2 = {1,2,3,4};
        boolean m,n;
        m = arg1.equals(arg2);
        n = Arrays.equals(arg1,arg2);
        System.out.println(m + ",\n" + n);



    }
}
