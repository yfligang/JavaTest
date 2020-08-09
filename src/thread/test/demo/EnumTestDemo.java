package thread.test.demo;

public class EnumTestDemo {

    enum Color{
        red,green,black,white;
    }

    public EnumTestDemo(){
        Color color1 = Color.valueOf("red");
        Color color2 = Color.valueOf("green");
        //Color color3 = Color.valueOf("cool");
        System.out.println(color1);
        System.out.println(color2);
        //System.out.println(color3);

        Color[] arr = Color.values();
        for (Color color:arr
             ) {
            System.out.println(color);
            System.out.println(color.ordinal()); //enum Color中值对应的索引
        }
    }

    public static void main(String[] args) {
        EnumTestDemo etd = new EnumTestDemo();
    }
}
