package WorkStudy.StudayWork;

public class wuDi implements yeXu {

    @Override
    public void stop() {
        System.out.println(123);
    }

    public static void main(String[] args) {
        wuDi wd = new wuDi();
        wd.stop();
        yeXu.cool();
        wd.get("123");

        yeXu yx = new wuDi();
        yx.get("11");
        yx.stop();
    }
}
