package TianAnMen;

public class TankTest {

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        if (s1 != s2)
            System.out.println(111);
            else
                System.out.println(222);

        System.out.println("s1 == s2" +s1 == s2); //该表达式会先判断 "s1 == s2" + s1 然后再判断
        //前面的这个值是不是等于s2 所以前面的值为 ""s1 == s2" "Hello"" 是不是等于 "Hello"
        System.out.println("s1 == s2为" + (s1 == s2));

        String s3 = new String("Hello");
        System.out.println(s1 == s3);

        int x = 1;
        System.out.println(x++); //x++ 先输出 x 到值，再加上 1
        System.out.println(x++);
        System.out.println(++x); //++x 先输出x +1的值  4

        char c = 75;
        System.out.println("c = " + c);

        StringBuffer sb1 = new StringBuffer("Runoob");
        StringBuffer sb2 = new StringBuffer("Hello");
        sb1.delete(1,3);
        sb1.append(sb2);
        System.out.println(sb1);

        Math.round(3.7);

        int a = 1;
        double a1 = (float)a;
        System.out.println(a1); //1.0


        //以下哪个类可以访问所有（子类与超类）的 public 和 protected 方法 ?  子类
    }
}
