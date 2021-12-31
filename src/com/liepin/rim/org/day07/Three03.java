package com.liepin.rim.org.day07;

public class Three03 {

    public int[] twoSum(int[] nums, int target){
        if (nums.length <= 0){
            return new int[0];
        }
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target){
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        for (int num:twoSum
             ) {
            System.out.print(num + " ");
        }
        return twoSum;
    }

    public static void main(String[] args){
        Three03 three03 = new Three03();
        three03.twoSum(new int[]{10,2,13,11,9,4,6},10);
    }
}
