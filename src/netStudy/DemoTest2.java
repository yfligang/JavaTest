package netStudy;

public class DemoTest2 {

    public static void main(String[] args){
        Test test1 = new Test();
        Test test2;
        test1.a = 10;
        test2 = test1.cloning();
        test2.a = 20;

        System.out.println("dt1.a = " + test1.a);
        System.out.println("dt2.a = " + test2.a);
    }


}

class Test implements Cloneable{
    int a;

    Test cloning(){
        try{
            return(Test) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}