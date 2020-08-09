package com.guazi.test;

public class Today extends Day {

    public Today(int n){
        super(n);
        System.out.println("子类有参构造方法被调用");
    }

    @Override
    public void cool() {
        super.cool();
        System.out.println(2);
    }

    public static void main(String[] args) {
        //Today today = new Today(); //子类无参实例化 生成对象

        /*父类无参构造方法被调用
        子类无参构造方法被调用
        当父类有有参构造方法，子类实例化对象没有参数，还是只会调用父类无参的构造方法
        */

        Today today1 = new Today(100); //子类有参实例化 生成对象
        /*
        当子类没有有参构造函数，子类实例化有参时，会报错
        如果将子类无参构造方法修改为有参构造方法,之前无参实例化对象会报错，代码注释后还是会生成
        父类无参构造方法被调用
        子类无参构造方法被调用
        说明子类的有参构造方法，因为没有加上super(),还是会调用父类的无参构造方法
        如果将父类中的无参构造方法注释掉，在子类的有参构造方法处会报错，提示 没有默认的构造器，这是因为子类的
        有参构造方法没有使用super()方法去引用父类的有参构造方法

        对于super()方法的使用，不仅仅是构造方法，其它方法也有用




         */

        today1.cool();


    }
}
