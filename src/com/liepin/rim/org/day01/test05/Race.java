package com.liepin.rim.org.day01.test05;
//龟兔赛跑中给兔子创建一个类
public class Race implements Runnable {
    //定义一下获胜者
    private static String winner;

    @Override
    public void run() {
        //这里加上一个循环，判断下是谁跑了第几步
        for (int i = 0; i <= 100; i++) {
            //判断线程是否是兔子的
            if (Thread.currentThread().getName().equals("兔子")&&(i%10 == 0)){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameOver(i);
            //如果比赛结束了，就停止程序
            if (flag == true){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-->跑了第 " + i + "步");
        }
    }

    //判断是否完成比赛
    private boolean gameOver(int steps){
        //需要先判断下比赛是否已经完成
        if (winner != null){ //已经存在胜利者了
            return true;
        }else if (winner == null){
            if (steps >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
