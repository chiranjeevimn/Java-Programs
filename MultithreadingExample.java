public class MultithreadingExample implements Runnable {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Handling any exceptions that may occur
            System.out.println("Exception encountered: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultithreadingExample());
            thread.start();
        }
    }
}
