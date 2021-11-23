package com.liepin.rim.org.reverse;

public class ReverseArray {

    static int[] array = new int[]{10,11,34,54,21,9,0,11};
    static int[] newArray = new int[]{12,31,5,21,43};

    //将数组{10,11,34,54,21,9,0,11} 原地反转
    public static void reverse(int[] array){
        //int[] newArray = new int[];
        int temp;
        for (int i = 0; i < array.length/2 ; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int num : array
             ) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        reverse(array);
        System.out.println("========================");
        reverse(newArray);
    }
    
}
