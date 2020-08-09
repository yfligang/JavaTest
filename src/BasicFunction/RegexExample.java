package BasicFunction;

import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args){
        String content = "I am noob" + "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(content,pattern);
        boolean isMatch1 = Pattern.matches(pattern,content); //前面的是否包含后面的
        System.out.println(isMatch);
        System.out.println(isMatch1);

    }
}
