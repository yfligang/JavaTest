package WeekendTest;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"hello");
        ht.put(2,"world");
        //打印出Hashtable中的value值
        for (Object ob1:ht.values()
             ) {
            System.out.println(ob1);
        }

        System.out.println("---我是分割符---");

        Hashtable ht1 = new Hashtable(1);
        ht1.put("hello",3);
        ht1.put("world",4);
        ht1.put("!",5);
        for (int i = 0; i < 11; i++) {
            ht1.put(i,i*1);
        }

        //打印出Hashtable中的value值
        for (Object ob1:ht1.values()
        ) {
            System.out.println(ob1);
        }


        Hashtable hb = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        hb.put("Zara",new Double(3001.34));
        hb.put("Mahnaz",new Double(123.22));
        hb.put("Ayan",new Double(1378.00));
        hb.put("Daisy",new Double(90.22));
        hb.put("Qadir",new Double(-19.08));

        names = hb.keys(); //把object转换为String?
        while(names.hasMoreElements()){
            str = (String)names.nextElement();
            System.out.println(str + ": " + hb.get(str));
        }

        System.out.println();
        bal = ((Double)hb.get("Zara")).doubleValue();
        hb.put("Zara",new Double(bal+1000));
        System.out.println("11" + hb.get("Zara"));

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");


    }


}
