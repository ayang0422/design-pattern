package com.yang.creation.singleton;

import java.security.PublicKey;
import java.util.concurrent.CountDownLatch;

/**
 * 单例模式案例
 *
 * 介绍：
 *  提供创建对象的最佳方式，也就是该类只有一个对象，并且由自己负责创建。
 *  这个类提供了访问其对象的唯一方法，可以直接访问，不需要实例化该类对象
 * 主要解决：
 *  一个全局使用的类被频繁创建与销毁
 * 使用场景：
 *  各种计数器，不用每次都写入数据库，可以
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class SingletonDemo {

    public static void main(String[] args) throws Exception {
        SingleObject instance = SingleObject.getInstance();
        SingleObject instanc2 = SingleObject.getInstance();
        System.out.println(instanc2 == instance);

        /**
         * 测试多线程下是否正常
         */
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(instance == SingleObject.getInstance());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
    }


}
