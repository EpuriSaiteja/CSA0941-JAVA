class MyThread implements Runnable {
    private int count;

    public MyThread() {
        count = 0;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " : " + count);
        }
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "Thread 1");
        Thread t2 = new Thread(myThread, "Thread 2");

        t1.start();
        while (t1.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t2.start();
        while (t2.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Count: " + myThread.getCount());
    }
}