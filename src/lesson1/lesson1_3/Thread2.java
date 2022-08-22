package lesson1.lesson1_3;

public class Thread2 extends Thread {
    Year year;

    public Thread2(Year year) {
        this.year = year;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (year.getYear() % 4 == 0 && year.getYear() % 100 != 0 || (year.getYear() / 400 == 0)) {
                System.out.println(year.getYear() + " is a leapyear");
            }else System.out.println(year.getYear() + " is not a leapyear");

        }
    }
}
