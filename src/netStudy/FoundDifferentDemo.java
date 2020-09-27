package netStudy;

public class FoundDifferentDemo {

    public static void main(String[] args){
        String obj1 = new String("Hello");
        String obj2 = new String("Hello");

        if (obj1.hashCode() == obj2.hashCode()){
            System.out.println("obj1和obj2的哈希码相等");
        }
        if (obj1 == obj2){
            System.out.println("obj1和obj2的内存地址一样");
        }
        if (obj1.equals(obj2)){
            System.out.println("obj1和obj2的值相等");
        }
    }
}
