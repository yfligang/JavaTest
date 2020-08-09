package BasicFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args){
        //按指定模式在字符串中查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        //创建pattern对象
        Pattern pt = Pattern.compile(pattern);
        System.out.println(pt);

        //现在创建matcher对象

        String[] str = new String[10];
        for (String str1:str
             ) {
            System.out.println(str1);
        }

    }
}
