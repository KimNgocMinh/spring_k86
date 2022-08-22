package lesson1;

public class Lesson1_1 extends Thread{
    int stt;

    public Lesson1_1(int stt) {
        this.stt = stt;
    }

    @Override
    public void run() {
        System.out.println("STT cua Thread " + stt + " : " + getId());
    }

}
