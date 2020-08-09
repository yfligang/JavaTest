package maimai.com.cool;

//继承Thread类,创建线程
public class GuessANumber extends Thread {
    private int number;
    public GuessANumber(int number){
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        int count = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random()*100 + 1); //从1~100中随机选出一个数并+ 1
            System.out.println(this.getName() + "guesses" + guess); //其中this.getName为获取线程的名字和随机数
            count++;
        }while(guess != number); //number为实例化输入的数字
        System.out.println("** Correct!" + this.getName() + "in" + count + "guess.**");
    }
}
