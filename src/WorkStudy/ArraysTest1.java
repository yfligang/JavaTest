package WorkStudy;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysTest1 {

    public static void main (String[] args){
        int[] num = {1,2,3,4,1,3,4,78,54,32,87};
        HashMap map1 = new HashMap();
        String[] arg1 = {"Hello","World","1","cool","ijhdhhdh","qsjjsjdsjdj","Hello","World"};
        HashMap map2 = new HashMap();

        for (int i = 0; i < arg1.length; i++) {
            for (int j = i + 1; j < arg1.length; j++) {
                if (arg1[i].equals(arg1[j])){
                    map2.put(arg1[i],0);
                }
            }

        }

        for (Object str1:map2.keySet()
        ) {
            System.out.println(str1);
        }

        System.out.println("---------------------------");

        //查找数组中的重复元素

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]){
                    map1.put(num[i],0);
                }
            }
        }

        for (Object num3:map1.keySet()
             ) {
            System.out.println(num3);
        }
    }
}
