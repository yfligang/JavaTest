package BasicFunction;

public class BasicDataType {

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

    }
}
