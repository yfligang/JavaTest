package extendsTest;

public class Animal {
    private String name;
    private int id;

    private void look(){
        //System.out.println("父类的私有类子类调用不了的");
    }

    public Animal(String myName, int myId){
        name = myName;
        id = myId;
        //System.out.println("父类的构造方法");
    }

    public void cool(){
        //System.out.println("X");
    }

//    public void eat(){
//        System.out.println(name + "正在吃");
//    }
//
//    public void sleep(){
//        System.out.println(name + "正在睡");
//    }
//
//    public void introduction(){
//        System.out.println(id + name + ".");
//    }

    public static void main(String[] args) {
        String str1 = "1234567hello";
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
}
