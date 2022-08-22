package lesson1;

public class MyThread extends Thread{
    private String name;
    private int sleep;

    public MyThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try {
            sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " sau " + (double)sleep/1000 + "s");
    }
}
