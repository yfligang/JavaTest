package WeekendTest;

public class ThreadTestDemo1 extends Thread {
    private int number;
    public ThreadTestDemo1(int number){
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        int count = 0;
        int guess = 0;
        do {
            guess = (int)(Math.random()*100 + 1);
            System.out.println(this.getName() + "guesses" + guess);
            count++;
        }while (guess != number);
    }

    public void start(){

    }
}
