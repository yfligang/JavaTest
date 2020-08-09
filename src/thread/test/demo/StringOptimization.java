package thread.test.demo;

public class StringOptimization {

    public static void main(String[] args) {

        String[] arr1 = new String[50000]; //创建一个含有50000个元素的String数组
        for (int i = 0; i < 50000; i++) {
            arr1[i] = "s" + i;  //数组中添加 "s" + i每个元素
        }

        long startTime1 = System.currentTimeMillis(); //打当前的时间
        System.out.println(startTime1); //是时间戳形式的

        for (int i = 0; i < 50000; i++) {
            arr1[i] = "hello";
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("直接使用字符串: " + (endTime1 - startTime1) + "ms"); //可以直接使用时间戳进行加减

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arr1[i] = new String("hello");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用new关键字: " + (endTime2 - startTime2) + "ms");

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arr1[i] = new String("hello");
            arr1[i] = arr1[i].intern();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("使用intern方法优化: " + (endTime3 - startTime3) + "ms");



    }
}
