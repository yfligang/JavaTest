package WeekendTest;

public class CompareTest {
    public static void main(String[] args) {
        CompareTest ct = new CompareTest();
        //ct.compareTest();
        //ct.OrigTest();
        //ct.removeCharAt();
        ct.removeString();
    }

    public CompareTest(){ //构造函数
        System.out.println("无参构造函数");
    }

    public void compareTest(){
        String str1 = "hello,world!";
        String str2 = "China No. one";
        Object obj = str2;
        //compareTo 来比较两个字符串，并返回字符串中第一个字母ASCII的差值
        int num = str1.compareTo(str2);
        int num1 = str1.compareToIgnoreCase(str2);
        int num2 = str1.compareTo(obj.toString()); //这个和第一个没有区别

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
    }

    public void OrigTest(){
        String str1 = "hello,world!";
        String str2 = "or";
        int index = str1.lastIndexOf(str2);
        if (index == -1){
            System.out.println("没有找到字符串");
        }else{
            System.out.println("在字符串中的位置为: " + index);
        }
        System.out.println(str1.lastIndexOf(',')); //字符在字符串中的下标
        System.out.println(str1.lastIndexOf(',',1)); //-1

    }

    public void removeCharAt(){
        String str = "I am a teacher!";
        //str.trim();
        String str1 = str.substring(0,1); //只保留字符串的从0到1的字符
        String str2 = str.substring(1); //截取从下标为1开始，一直到结束
//        System.out.println(str1);
//        System.out.println(str2);

        str.charAt(2);//返回下标为2的char字符
        System.out.println(str.charAt(2)); //返回为a
    }

    public void removeString(){
        String str = "How do you do?";
        //我想删除第5个元素，然后再显示剩余的字符串
        String str1;
        str1 = str.substring(0,5) + str.substring(6); //显示0到4，然后从下标6开始再显示
        System.out.println(str1);
    }

    
}
