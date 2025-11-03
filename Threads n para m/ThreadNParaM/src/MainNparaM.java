import java.util.ArrayList;
import java.util.List;

public class MainNparaM {
    public static void main(String[] args) throws Exception {

        long inicioThread = System.nanoTime();
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            int threadId = i; 

            Thread thread = Thread.startVirtualThread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Virtual Thread " + threadId + " executando");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }

        long fimThread = System.nanoTime();
        System.out.printf("[Virtual N:M] Tempo total para 10 threads: %.2f ms%n", (fimThread - inicioThread) / 1_000_000.0);
    }
}