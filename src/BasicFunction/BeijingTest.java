package BasicFunction;

import java.util.Random;

public class BeijingTest {
    //测试下垃圾回收机制,先把方法写好.方法就是回收类中对象为null的


    public static void main(String[] args) {
//        MoonCake mc1 = new MoonCake(1); //
//        MoonCake mc2 = new MoonCake(2);
//        MoonCake mc3 = new MoonCake(3);
//        mc2 = mc3 = null;
//
//        System.gc(); //系统垃圾回收

        //初始化随机类，生成随机对象
        Random rd = new Random();
        int[] nums = new int[100]; //定义这个数组的长度为100
        for (int i = 0; i <nums.length; i++) {
            nums[i] = rd.nextInt(101); //从1～100中随机生成数，将随机数赋给数组
        }
        //读取数组中的每个数
        for (int i:nums
             ) {
            System.out.println(i);

        }

        System.out.println("我是分隔符----------------------");

        //定义一个数组，这个数组主要是来记录出现次数相同数的次数
        int[] nums1 = new int[100];
        //找到这个数组中出现次数最多的数和出现的次数
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >i ; j--) {
                if (nums[i] == nums[j]){
                    nums1[m] = nums1[m] + 1;
                }
            }
            m++;
        }
        //打印出 nums1数组的值
        for (int i:nums1
             ) {
            System.out.println(i);
        }
        System.out.println("我是分隔符---------------");
        //找到这个数组中最大的值
        for (int i = 1; i < nums1.length ; i++) {
            int temp = 0;
            int max = nums1[0];
            if (nums1[i] > max){
                temp = nums1[i];
                nums1[i] = max;
                nums1[0] = temp;
            }
        }
        System.out.println(nums1[0]); //找到这个数组最大的值

    }


}

//class MoonCake extends Object{
//    int id;
//    MoonCake(int id){
//        this.id = id;
//        System.out.println("Cake对象: " + id + "is created" );
//    }
//
//    public void finalize() throws java.lang.Throwable{
//        super.finalize();
//        System.out.println("Cake对象: " + id + "is closed");
//        //后创建的先被关闭了
//
//    }
//
//}
