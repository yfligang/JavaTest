package TianAnMen;

public class CoolTestDemo {

    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5};
        ChangeIt.doIt(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + "");
        }
        CoolTestDemo ctd = new CoolTestDemo();
        ctd.fun(); //静态方法想调用动态方法，需要实例化
    }

    int fun(){
        System.out.println(20);
        return 20;
    }
}

class ChangeIt{
    public static void doIt(int[] nums){
        nums = null;

    }
}
