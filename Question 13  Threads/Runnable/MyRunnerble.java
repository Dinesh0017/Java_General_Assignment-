public class MyRunnerble implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
    }
}