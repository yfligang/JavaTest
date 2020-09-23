package WorkStudy;

public class ShitDemoTest {
}

class Solution{
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println("相加为9的两个数的下标为: " + i + " " +  j + "\n" + "相加为9的两个数为: "
                            + nums[i] + " " + nums[j]);
                    return new int[]{i,j};
                }
            }


        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution sl = new Solution();
        sl.twoSum(nums,target);
    }
}
