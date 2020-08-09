package BasicFunction;

public class BasicDataType {

    static int nick = 1; //类变量

    String str = "Hello_world!"; //实例变量

    public void method(int i){
        i = 0; //局部变量
    }

    public static void main(String[] args){
        //byte
        System.out.println("基本类型:Byte 二进制位数为 " + Byte.SIZE);
        System.out.println("包装类: java.lang.Byte");
        System.out.println("最小值: Byte.MIN_VALUE = "  + Byte.MIN_VALUE);
        System.out.println("最大值: Byte.MAX_VALUE = " + Byte.MAX_VALUE);

        //short
        System.out.println("基本类型:Short 二进制位数为 " + Short.SIZE);
        System.out.println("包装类: java.lang.Short");
        System.out.println("最小值为:" + Short.MIN_VALUE);
        System.out.println("最大值为:" + Short.MAX_VALUE);

        //int
        System.out.println("基本类型: int 二进制位数为 " + Integer.SIZE);
        System.out.println("包装类: java.lang.Integer");
        System.out.println("最小值: " + Integer.MIN_VALUE);
        System.out.println("最大值: " + Integer.MAX_VALUE);

        //long
        System.out.println("基本类型: long二进制位数为 " + Long.SIZE);
        System.out.println("包装类: java.lang.Long");
        System.out.println("最小值: " + Long.MIN_VALUE);
        System.out.println("最大值:" + Long.MAX_VALUE);

        //float
        System.out.println("基本类型: float二进制位数为 " + Float.SIZE);
        System.out.println("包装类: java.lang.float");
        System.out.println("最小值: " + Float.MIN_VALUE);
        System.out.println("最小值: " + Float.MAX_VALUE);

        //double
        System.out.println("基本类型: double二进制位数为 " + Double.SIZE);
        System.out.println("包装类: java.lang.double");
        System.out.println("最小值: " + Double.MIN_VALUE);
        System.out.println("最大值: " + Double.MAX_VALUE);

        //char
        System.out.println("基本类型: char二进制位数为 " + Character.SIZE);
        System.out.println("包装类: java.lang.Character");
        System.out.println("最小值: " + (int)Character.MIN_VALUE); //如果不转换为 int 最小值为方框
        System.out.println("最大值: " + (int)(Character.MAX_VALUE)); //如果不转换为 int 最大值为方框

        int num = 0x64;
        System.out.println(num); //还是打印出10进制

        int num1 = 1300;
        byte b = (byte)num1;
        System.out.println(b);

        byte c = 1;
        int d = c;
        System.out.println("d = " + d);

        ZiDongLeiZhuan zdlz = new ZiDongLeiZhuan();

        System.out.println("我是分隔符----------------------");


    }

    static class ZiDongLeiZhuan{

        char c1 = 'a';
        int d1 = c1;

        public ZiDongLeiZhuan(){
            System.out.println("c1的值为" + c1);
        }

    }

    class Shangxin{

        public void Shangxin(){
            System.out.println("Hello_World!");
        }

    }

    public BasicDataType(){
        System.out.println(1);
    }
}