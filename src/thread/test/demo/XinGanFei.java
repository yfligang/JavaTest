package thread.test.demo;

public class XinGanFei {
    public static void main(String[] args) {
        Color color = Color.red; //color的颜色为 红色
        System.out.println(color);
        PhoneSystem ps = PhoneSystem.Android;
        System.out.println(ps);
        System.out.println("-----------------");
        ps.PhoneSystem1();

        //获取enum PhoneSystem中所有元素
    }

    enum PhoneSystem{
        Android,bada,ios,sysbian;

        public void PhoneSystem1(){
            for (PhoneSystem ps:PhoneSystem.values()
                 ) {
                System.out.println(ps);
            }
        }
    }



}

enum Color{
    red,green,blue;
}
