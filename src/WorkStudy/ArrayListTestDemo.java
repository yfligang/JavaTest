package WorkStudy;

import java.util.ArrayList;

public class ArrayListTestDemo {
    public static void main(String[] args){
        //ArrayList添加元素,先初始化
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(0,"Google");
        arrayList.add(1,"is"); //数字下标
        arrayList.add(2,"Hello"); //先运行的 is,然后运行 hello发现 index是0，就排在is 前面
        arrayList.add(3,"world"); //index不能超过ArrayList的长度
        System.out.println(arrayList);

        String arg1 = arrayList.get(0);
        //System.out.println(arg1);

        arrayList.set(1,"are");
        System.out.println(arrayList);

        arrayList.remove(1); //删除掉索引为1的元素
        System.out.println(arrayList);
        arrayList.remove("world");
        System.out.println(arrayList);
        arrayList.remove("cool");
        System.out.println(arrayList);

        int m = arrayList.size();
        System.out.println(m);

        for (int i = 0; i < m ; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("============>");

        for (String str:arrayList
             ) {
            System.out.println(str);
        }


//        String[] arg = new String[5];
//        for (int i = 0; i < arg.length; i++) {
//            arg[i] = "Hello" + i;
//        }
//        System.out.println(arg);

    }
}
