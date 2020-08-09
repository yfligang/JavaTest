package TianAnMen;

//用write()把字符'A'和紧跟着的换行符输出到屏幕
public class WriteDemo {
    //演示system.out.write()
    public static void main(String[] args) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
        System.out.println(b); //这块输出显示的是对应的值，write显示的是对应的字符
        System.out.println('\n');


    }
}
