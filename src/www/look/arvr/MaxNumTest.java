package www.look.arvr;

public class MaxNumTest {
    //比较三个值并返回最大值
    public static <T extends Comparable<T>> T maxinum(T x,T y,T z){ //maxinum方法名称
        T max = x; //假设x是初始最大值
        if (y.compareTo(max) > 0){
            max = y;  //y更大
        }
        if (z.compareTo(max) > 0){
            max = z; //z更大
        }
        return max;
    }

    public void cool(int num){
        if (num > 10){
            System.out.println("这是一个很开心的事情");
        }
        if (num > 0){
            System.out.printf("系统自动延迟5s");
        }
    }

    public static void main(String[] args) {
        System.out.printf("%d,%d 和 %d 中最大的数为 %d\n\n ",3,4,5, maxinum(3,4,5));

        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",1.1,2.2,3.3,maxinum(1.1,2.2,3.3));

        System.out.printf("%s, %s 和 %s中最大的数为 %s\n", "pear","apple","orange", maxinum("pear","apple","orange"));

        MaxNumTest maxNumTest = new MaxNumTest();

        try {
            System.out.println(1);
            Thread.sleep(3000);
            maxNumTest.cool(9);

        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }


}

