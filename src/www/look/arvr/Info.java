package www.look.arvr;

public class Info<T> {
    private T var ; //定义泛型变量 这里的T就相当于 String、 int等

    public void setVar(T var){
        this.var = var;
    }

    public T getVar(){
        return this.var;
    }

    public String toString(){
        return this.var.toString();
    }

}

class Demo1{
    public static void main(String[] args) {
        Info<String> info = new Info<String>(); //使用String为泛型类型
        Info<Integer> info1 = new Info<Integer>();
        info1.setVar(100);
        info.setVar("MLDN"); //设置内容
        fun(info); //把String泛型类型的info对象传递给Object泛型类型的temp
        funny(info);
        funny(info1);
    }

    public static void fun(Info<String> temp){
        System.out.println("内容" + temp);
    }

    public static void funny(Info<?> temp1){
        System.out.println("新内容" + temp1);
    }


}
