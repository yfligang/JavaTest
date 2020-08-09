package www.look.arvr;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon"); //name集合的第一个元素为 icon
        age.add(18); //age集合的第一个元素为 18
        number.add(314); //number集合的第一个元素为 314

        getData(name);
        getData(age);
        getData(number);

        getUperNumber(name);
        /*会出现错误，因为 getUperNumber()方法中的参数已经限定了参数泛型上限为Number，所以泛型为String的是在这个范围之内
        所以会报错
         */
        getUperNumber(age);
        getUperNumber(number);

        //getSuperNumber(name);
        getSuperNumber(age);
        getSuperNumber(number);



    }

    public static void getData(List<?> data){
        System.out.println("data: " + data.get(0));
    }

    public static void getUperNumber(List<? extends Object> data){ //extends后面的意思其实就是只能是Number和以下的
        System.out.println("data: " + data.get(0));
    }

    public static void getSuperNumber(List<? super Integer> data){
        System.out.println("data: " + data.get(0));
    }

}
