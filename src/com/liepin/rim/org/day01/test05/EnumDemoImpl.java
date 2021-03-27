package com.liepin.rim.org.day01.test05;

public class EnumDemoImpl {

//    public EnumDemoImpl(){
//
//    }

    private EnumDemoImpl(){
        System.out.println("私有的构造方法");
    }

    public static void main(String[] args){
        EnumDemoImpl edi = new EnumDemoImpl();
        boolean bl1 = edi.equals(new Race());
        boolean bl2 = edi.equals(new EnumDemoImpl());
        System.out.println("1" + bl1);
        System.out.println("2" + bl2);
        System.out.println("==========================");
        EnumTest[] et = EnumTest.values();
        int i = et[0].compareTo(EnumTest.YELLOW);
        System.out.println(i);

        System.out.println("=========================");

        for (EnumTest ett:EnumTest.values()
             ) {
            System.out.println(ett);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
