package CoolFriday;

public abstract class NiuRouFen {

    public void cool(){
        System.out.println(1);
    }

    private void study(){

    }

    abstract void sky(String str);

    public static void main(String[] args) {

    }

}

class NiuRou extends NiuRouFen{
    public static void main(String[] args) {
        NiuRou nr = new NiuRou();
        nr.cool();
    }

    @Override
    void sky(String str) {  //抽象类中的抽象方法，继承子类去重写
        System.out.println(2);
    }
}
