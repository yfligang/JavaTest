package ProtectedTest2;

public class Funny {

    public static void main(String[] args){

        System.out.println(add(3,4,5));

        System.out.println(add(1,0));

        System.out.println(add(new int[]{1,23,4,6,7,8}));

    }

    //下面我们来写add方法
    public static int add(int...nums){
        int sum = 0;
        for (int i = 0;i < nums.length; i++){
            sum = sum + nums[i];
        }

        return sum;
    }

//    public static void add(int...nums){
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//    }
}
