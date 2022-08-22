package lesson1.lesson1_3;

import java.util.Random;

public class Thread1 extends Thread{
    Year year;

    public Thread1(Year year) {
        this.year = year;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            year.setYear((random.nextInt(9000) + 1000));
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
