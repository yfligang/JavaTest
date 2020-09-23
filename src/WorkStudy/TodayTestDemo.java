package WorkStudy;
/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 */
public class TodayTestDemo {

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println("相加为9的两个数的下标为: " + i + " " +  j + "\n" + "相加为9的两个数为: "
                     + nums[i] + " " + nums[j]);
                }
            }
        }
    }

}
