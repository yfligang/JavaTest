package interface_test.com;

public class Chinese implements people {

    public void say(){
        System.out.println("hello,world!");
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        cn.say();
        cn.nums(1,2);
        cn.nums(10,20);
    }

    public int[] nums(int num1,int num2){
        int[] nums = {num1,num2};
        for (int num:nums
             ) {
            System.out.println(num);
        }
        return nums;

    }
}
