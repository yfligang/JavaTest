package WorkStudy;

import java.util.Arrays;

public class ArrayTestDemo {
    /*/
    1.使用二分查找法 binarySearch
    2.判断两个数组是否相等 equals
    3.将指定的值分配给指定的数组
    4.对数组进行排序
     */
    public static boolean bl;
    public static void main(String[] args){
        //先定义一个数组
        int[] array = {99,87,156,246,278,19,1,2,5,6,7,8,19,9,21,45};
        //对该数组进行排序(升序)
        int[] array1 = new int[array.length];
        int[] array2 = new int[array.length];
        //使用Arrays类的方法来进行排序
        Arrays.sort(array);
        for (int num:array
             ) {
            System.out.print(num + " "); //此时srray数组的顺序已经是从小到大了
        }

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }

        System.out.println();

        for (int num:array1
             ) {
            System.out.print(num + " ");
        }

        System.out.println();

        //判断下这两个数组是不是相等

        bl = Arrays.equals(array,array1);
        System.out.println(bl);
        System.out.println();

        //向数组中填充值,向新数组赋值不行
        Arrays.fill(array2,10);
        for (int num:array2
             ) {
            System.out.println(num);
        }
        System.out.println();

        int num = Arrays.binarySearch(array,10);
        int num1 = Arrays.binarySearch(array,19);
        System.out.println(num);
        System.out.println(num1);
    }
}
