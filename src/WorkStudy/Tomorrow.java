package WorkStudy;

public class Tomorrow {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("毛豆新车官网: ");
        //向String字符串中添加String字符串
        sb.append("www.");
        sb.append("guazi.");
        sb.append("com");

        System.out.println(sb);
        System.out.println("-------------");
        //将字符串里的字符进行反转
        sb.reverse();
        System.out.println(sb); //String字符串已经被调转

        //移除字符
        sb.delete(0,1); //删除掉下标从0开始，到1之前的下标的值，如(0,1)就是删除0，(0,5)就是删除0,1,2,3,4
        System.out.println(sb);
        //插入各种内容，包括 int String 等,设定在第几个位置去插入
        sb.insert(0,1); //插入数字
        System.out.println(sb);

        sb.insert(0,"m"); //插入字符
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.replace(0,5,"无敌的火呀");
        System.out.println(sb);

        sb.replace(0,5,"我字数超了怎么办"); //这块不是单独的一个一个换，而是将原字符串中下标从0~4的都换成
        //后面的字符串, 即使数字超了也没有关系
        System.out.println(sb);

        //返回当前的容量
        StringBuffer sb1 = new StringBuffer(); //StringBuffer初始没有字符
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());


        StringBuffer sb2 = new StringBuffer("123");
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());

        StringBuffer sb3 = new StringBuffer("12345678901234567890"); //
        sb3.append("1234567890"); //
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        StringBuffer sb6= new StringBuffer("abcdefghijklmn");
        System.out.println("值为: " + sb6.charAt(10));


//        StringBuffer sb4 = new StringBuffer();
//        sb4.append("12345678901234567");
//        System.out.println(sb4.capacity());
//        System.out.println(sb4.length());
//
//        StringBuffer sb5 = new StringBuffer();
//        sb5.ensureCapacity(80);
//        System.out.println(sb5.capacity());
//        System.out.println(sb5.length());

    }
}
