package ProtectedTest;

public class TestArray1 {

    //打印一个数组的方法
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        //打印出这个数组中最大值
        int num = 0;
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        //System.out.println("该数组中最大的值为: " + max);
    }


    public static void main(String[] args){

        TestArray1.printArray(new int[]{1,2,3,4});
        TestArray1.reverse(new String[]{"h","e","l","l","o"});

        String[][] strings = new String[2][];
        strings[0] = new String[]{"h"};
        strings[1] = new String[]{"e"};

        for (String[] str12:strings
             ) {
            for (String str13:str12
                 ) {
                System.out.println(str13);
            }
        }

        String string[][] = new String[3][2];

        double[] myList = {1.9,2.9,3.4,3.5};

        //打印所有数组元素
        for (double num:myList
             ) {
            //System.out.println(num);
        }

        //计算所有元素的总和
        double num1 = 0.0;
        for (int i = 0; i < myList.length; i++) {
            num1 += myList[i];
        }
        //System.out.println(num1);

        //查找最大元素 假设数组中的第一个元素为最大值，如果后面的值比第一个大，就让这个值为最大值。然后继续运行后面的值，如果比新的值
        //还大，就成为新的最大的值
        double max = myList[0];
        double temp = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max){
                max = myList[i];
            }
        }
        //System.out.println(max);
    }

    //写一个反转数组的方法
    public static void reverse(String[] str1){
        String[] str2 = new String[str1.length];

        for (int i = 0,j = str1.length -1; i < str1.length; i++,j--) {
            str2[j] = str1[i];
        }
        for (String str3:str2
             ) {
            System.out.println(str3);
        }
    }






}
