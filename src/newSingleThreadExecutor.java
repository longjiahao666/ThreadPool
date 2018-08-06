import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by long on 2018/8/6.
 */
public class newSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "\t开始发车啦....");
            });
        }
    }
}
