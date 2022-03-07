package spring.uz;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {
//            for (int i = 1; i <= 100; i++)
//                System.out.println(i + " " + Thread.currentThread().getName());
//        });
//        thread.start();
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 1; i <= 100; i++)
//                System.out.println(i + " " + Thread.currentThread().getName());
//        });
//        thread1.start();
//        thread.join();
//        System.out.println("B1 How Are you");
//
        Map<String, Integer> count = new Hashtable<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100000; i++) {
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName());
                count.put(Thread.currentThread().getName(),  count.getOrDefault(Thread.currentThread().getName(),0) + 1);
            });
        }
        executorService.shutdown();
        Thread.sleep(10000);
        for (String key: count.keySet()){
            System.out.println(key + ": " + count.get(key));
        }
    }

}
