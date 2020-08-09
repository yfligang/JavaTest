package ProtectedTest3;

public class SolutionTest {

    //给定一个整数数组 nums 和一个目标值 target
    // 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i +1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == 9){
                    System.out.println("目标值为 " + nums[i] + "，" + nums[j]);
                    System.out.println("数组下标为 " + i + "," + j);
                }
            }
        }
        int[] array1 = {1,2,3,4};
        SolutionTest.array(array1);
    }

    //数字反转(123->321)
    public static int[] array(int[] num1){
        int[] num2 = new int[num1.length];
        for (int i = 0,j=num1.length - 1; i < num1.length; i++,j--) {
            num2[j] = num1[i];
        }
        for (int num3:num2){
            System.out.println(num3);
        }

        return num1;
    }
}
