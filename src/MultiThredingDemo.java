public class MultiThredingDemo extends Thread {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getId());
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getId() + ": " + i); // Let the thread sleep for a while.
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getId() + " interrupted.");
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " exiting.");

    }
}
