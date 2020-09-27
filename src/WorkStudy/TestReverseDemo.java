package WorkStudy;
/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321

示例 3:

输入: 120
输出: 21

注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [-2的31次幂,  2的31次幂-1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

/*
如果数字为偶数位
如果数字位奇数位
如果数字 > 2的31次幂-1
如果数字 < -2的31次幂
 */
public class TestReverseDemo {

    public void testDemo(int num){
        if (num > (Math.pow(2,31) -1)){
            num = 0;
        }
        if (num < Math.pow(-2,31)){
            num = 0;
        }else {

        }

    }

    public static void main(String[] args){
        TestReverseDemo tr = new TestReverseDemo();

        tr.testDemo(123);
    }


}
