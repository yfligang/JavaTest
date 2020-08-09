package www.look.arvr;

public class GenericMethodTest {
    //泛型方法 printArray
    public static <E> void printArray(E[] inputArray){  //类的静态方法 inputArray是入参
        //输出数组元素   输出不同入参的返回值
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //创建不同类型数组 Integer, Double 和 Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("整型数组元素为: ");
        printArray(intArray);

        System.out.println("浮点型数组元素为: ");
        printArray(doubleArray);

        System.out.println("字符数组元素为: ");
        printArray(charArray);


    }
}
