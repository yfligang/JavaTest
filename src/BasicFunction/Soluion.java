package BasicFunction;

public class Soluion {


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Soluion soluion = new Soluion();
        soluion.twoSum(nums,target);
    }

    public int[] twoSum(int[] nums, int target) {
        //先找出这两个数
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        int m = 0;
        for (int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if ((nums[i] + nums[j]) == target ){
                    nums1[m] = i;
                    nums2[m] = j;
                }
                m++;
            }
        }
        for (int x:nums1
             ) {
            System.out.println("x = " + x);
        }

        System.out.println("--------------");
        for (int y:nums2
             ) {
            System.out.println("y = " + y);
        }

        return nums1;
    }
}
