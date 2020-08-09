package ProtectedTest;

public class MeiTuan {
    //编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 “”。
    // 例如： 输入: ["flower","flow","flight"] 输出: "fl"

    public static void main(String[] args){
        String[] str1 = {"f","l","o","w","e","r"};
        String[] str2 = {"f","l","o","w"};
        String[] str3 = {"f","l","i","g","h","t"};
        String[] str4 = new String[str2.length];

        for (int i = 0; i < str2.length ; i++) {
            if ((str1[i] == str2[i])&&(str2[i] == str3[i])){
                str4[i] = str1[i];
            }
        }

        //System.out.println(str4);
        for (String str:str4
             ) {
            System.out.println(str);
        }

    }



}
