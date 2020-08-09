package whatever.com;

import java.io.IOException;
import java.util.Scanner;

/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""

输入: ["flower","flow","flight"]
输出: "fl"
 */
public class LongestCommonPrefix {


    /*假设有一个最长的公共字符串，有什么特点呢
      1.这个字符串在n个字符串中都有
      2。而且是最长的
     */

    public String LongestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){ //如果数组为空或者数组的长度为空，直接返回最长公共字符串为空
            return " ";
        }
        String prefix = strs[0]; //String数组中的第一个字符串
        int count = strs.length; //数组的长度
        for (int i = 1; i < count ; i++) { //找最长公共前缀开始
            prefix = LongestCommonPrefix(prefix,strs[i]);
            if (prefix.length() == 0){
                break;
            }
        }

        System.out.println(prefix);
        return prefix;
    }

    public String LongestCommonPrefix(String str1,String str2) { //两个String参数
        int length = Math.min(str1.length(),str2.length()); //取两个字符串长度的小值
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        String[] args1 = {"flower","flow","flight"};
        String[] args2 = {"cool","qwertfolasxxx","1234ol000"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        //lcp.LongestCommonPrefix(args1);
        lcp.LongestCommonPrefix(args2);
    }



}
