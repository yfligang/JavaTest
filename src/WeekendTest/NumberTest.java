package WeekendTest;

public class NumberTest {
    //指定分割符将字符串分割为数组
    public static void main(String[] args) {
        String str = "Hello,World!,oo";
        String[] arg = str.split(",");
        for (String str1:arg
             ) {
            System.out.println(str1);
        }

        System.out.println("---------------");

        String str2 = "1-2-3-4-5-6-7-8-9-0";
        String[] arg2 = str2.split("-");
        for (String str3:arg2
             ) {
            System.out.println(str3);
        }

        System.out.println("我是分割符");

        String str3 = "q_w_e_r_t_y_u_i_o"; //有9个字符
        String[] arg3 = str3.split("_",3);
        /*limit表示将字符串分为多少份，为1时，全部显示，为2时，当出现要求的分割符时，前部分和后部分，当
          为3时，第一次遇到要求的分割符，第二次遇到要求的分割符，然后就是剩余部分
        */
        for (String str4:arg3
             ) {
            System.out.println(str4);
        }

    }
}
