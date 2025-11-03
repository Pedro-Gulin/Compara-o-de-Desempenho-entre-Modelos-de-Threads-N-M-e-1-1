import java.util.ArrayList;
import java.util.List;

public class Main1para1 {
    public static void main(String[] args) throws Exception {

        long inicioThread = System.nanoTime();
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            final int threadId = i;
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Thread" + threadId + " executando passo " + j);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }

        long fimThread = System.nanoTime();
        System.out.printf("[1:1] Tempo total para 10 threads: %.2f ms%n", (fimThread - inicioThread) / 1_000_000.0);
    }
}