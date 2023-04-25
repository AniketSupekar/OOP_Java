// Write a program to create multiple threads and demonstrate how two threads communicate with each other.

package exp13.src;

class worker extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("Thread is running");
    }
}

public class exp13 {
    public static void main(String[] args) {
        Thread t1 = new worker();
        Thread t2 = new worker();

        t1.start();
        t2.start();
    }
}
