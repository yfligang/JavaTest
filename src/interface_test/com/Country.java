package interface_test.com;

public final class Country {

    private final String str = "Chinese";

    public void funny(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Country ct = new Country();
        ct.funny();
    }
}