package WorkStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TorrowTestDemo {
    //在数组中查找指定元素
    public static void main(String[] args){
        //定义一个数组
        String[] args1 = {"Hello","World!","Cool","Today"};
        //查找数组中是否包含 "Cool"
        for (int i = 0; i < args1.length; i++) {
            if (args1[i] == "Cool"){
                System.out.println("数组中的第" + i + "元素为 Cool");
            }else {
                //System.out.println("数组不包含 Cool");
            }
        }
        System.out.println(args1);

        ArrayList arrayList = new ArrayList();
        arrayList.add("China");
        arrayList.add("USA");
        arrayList.add("India");
        arrayList.add("Russia");

        boolean m;
        m = arrayList.contains("India");
        System.out.println(m);

        ArrayList al = new ArrayList();
        al.add(0,"A");
        al.add(1,"B");
        al.add(2,"C");
        al.add(3,"D");
        al.add(4,"E");
        System.out.println(al);
        al.add(5,"F");
        al.add(6,"G");
        System.out.println(al);
    }
}

class TomorrowTest{
    public static void main(String[] args){
        //使用Arrays.fill方法来向数组中填充数据
        int[] nums = new int[5]; //数组中有5个元素
        int num = 100;
        Arrays.fill(nums,num); //将数组中的每个元组都填充为100
        for (int num1:nums
             ) {
            System.out.println(num);
        }

        //从数组下标增加不同的数
        int[] nums1 = new int[2];
        Arrays.fill(nums1,0,2,100);
        for (int num2:nums1
             ) {
            System.out.println(num2);
        }
    }
}
