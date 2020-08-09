package ProtectedTest2;

public abstract class ColorSee extends Monkey {

    public static void main(String[] args){

        ColorSee colorSee = new ColorSee() {  //实例化子类
            @Override
            void m() {
                System.out.println("Hello Wolrd!");
            }
        };

        colorSee.m(); //类的对象调用方法m 而m是继承于抽象父类的抽象方法
    }

    public synchronized void showDetails(){

    }

    protected synchronized void showDetails1(){

    }

    synchronized void showDetails2(){

    }

    private void showDetails3(){

    }

    public transient int showDetails4 = 55;  //不会持久化

    public int b;



}
