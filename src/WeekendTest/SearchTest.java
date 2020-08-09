package WeekendTest;

public class SearchTest {
    //查找子字符串在原字符串中的位置，可以使用 indexOf()方法来判断
    public static void main(String[] args) {
        String str = "Hello,World!";
        String str1 = "ll";

        if (str.contains(str1)){
            int num = str.indexOf(str1);
            System.out.println(num);
        }else{
            System.out.println("字符串不包含字符串");
        }
    }
}
