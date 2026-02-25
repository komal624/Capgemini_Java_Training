package iostreams.multithreading;
import java.util.Scanner;

class CounterTask implements Runnable {
    private static int counter = 1;
    private static final Object lock = new Object();
    private int limit;

    public CounterTask(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (counter > limit) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " -> " + counter);
                counter++;
            }

            try {
                Thread.sleep(50); // simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadedCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter counting limit: ");
            int limit = scanner.nextInt();

            if (limit <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            Thread t1 = new Thread(new CounterTask(limit), "Thread-1");
            Thread t2 = new Thread(new CounterTask(limit), "Thread-2");
            Thread t3 = new Thread(new CounterTask(limit), "Thread-3");

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Counting completed successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}