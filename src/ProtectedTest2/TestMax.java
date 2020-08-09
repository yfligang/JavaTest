package ProtectedTest2;

public class TestMax {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println(k);

        printGrade(78.5);
        printMessage("Hello world!",10);
    }
    //创建max方法，返回参数中比较大的数
    public static int max(int i,int j){ //void不用返回
        int result;
        if (i > j){
            result = i;
        }else {
            result = j;
        }
        return result;
    }

    public static void printGrade(double score){
        if (score >= 90.0){
            System.out.println('A');
        }
        else if (score >= 80.0){
            System.out.println('B');
        }
        else if (score >= 70.0){
            System.out.println('C');
        }
        else if(score >= 60.0){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }

    //方法: 连续n次打印一个消息
    public static void printMessage(String message,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
