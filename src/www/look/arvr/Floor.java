package www.look.arvr;

public class Floor<T> {

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Floor<Integer> integerFloor = new Floor<Integer>();
        Floor<String> stringFloor = new Floor<String>();

        integerFloor.add(10); //不用 integerFloor.add(new Integer(10));
        stringFloor.add("Hello,world!");

        System.out.printf("整型值为 :%d\n\n", integerFloor.get());
        System.out.printf("\"字符串为 :%s\n\n",stringFloor.get());
    }


}
