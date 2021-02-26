package com.liepin.rim.org.day01;

import java.util.ArrayList;

public class Demo03 {
    /*
    给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */

    static int[] array = {1,2,12,23,567,32,8,5,3,10,22,56,10,32,55};
    static int val = 13;

    public int removeItems(int[] array,int val ){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("删除前的集合数据为: " + list);

        for (int i = 0; i < list.size() ; i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == val){
                    list.remove(list.get(i));
                    list.remove(list.get(j-1));
                }
            }
        }
        System.out.println("删除后的集合数据为: " + list);
        return list.size();
    }

    public static void main(String[] args){
        //需要先将数组转换为集合
        Demo03 demo03 = new Demo03();
        demo03.removeItems(array,val);
    }
}
