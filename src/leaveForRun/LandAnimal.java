package leaveForRun;

public abstract class LandAnimal implements Animal {

    @Override
    public void breathe() {
        System.out.println("抽象类实现接口中的抽象方法");
    }
}
