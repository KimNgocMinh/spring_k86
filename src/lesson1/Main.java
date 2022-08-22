package lesson1;


import lesson1.lesson1_3.Thread1;
import lesson1.lesson1_3.Thread2;
import lesson1.lesson1_3.Year;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lest's Start : ");

        //lesson 1.1
/*        for (int i = 0; i < 50; i++) {
            Lesson1_1 thread = new Lesson1_1(i + 1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.start();
        }*/

        //lesson 1.2
       /* MyThread thread1 = new MyThread("ABC", 3500);
        MyThread thread2 = new MyThread("DEF", 2500);

        thread1.start();
        thread2.start();*/

        //lesson 1.3
        /*Year year = new Year();
        Thread1 thread1 = new Thread1(year);
        Thread2 thread2 = new Thread2(year);
        thread1.start();
        thread2.start();*/

        //lesson 1.4

    }
}
