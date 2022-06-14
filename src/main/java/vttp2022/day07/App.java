package vttp2022.day07;

import java.io.*;
import java.security.SecureRandom;
import java.util.*;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {

        // Create a thread pool
        // one thread should run on one comp
        ExecutorService thrPool = Executors.newFixedThreadPool(4);
        Random rand = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            String msg = "Thread-%d".formatted(i);
            int sec = rand.nextInt(1, 5);

            System.out.printf("\tDispatching %s to pool \n", msg);

            ThrMain thr = new ThrMain(msg, sec);
            thrPool.submit(thr);

        }
        System.out.println("Main Thread: Dispatched all threads"); 
    }
}
