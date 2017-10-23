package com.lyt.designpattens.singleton.test;

import java.util.concurrent.CountDownLatch;

import com.lyt.designpattens.singleton.Singleton2;

/**
 * 测试各个单例的效率
 * 
 * @author MJ
 *
 */
public class Test3 {
    
    public static void main(String[] args) throws InterruptedException {
        
        long start = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    Singleton2.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("消耗了  " + (end - start) + " ms");
    }
}
