package com.yang.creation.singleton;

import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.util.concurrent.CountDownLatch;

/**
 * 单例模式案例
 * <p>
 * 介绍：
 * 提供创建对象的最佳方式，也就是该类只有一个对象，并且由自己负责创建。
 * 这个类提供了访问其对象的唯一方法，可以直接访问，不需要实例化该类对象
 * 主要解决：
 * 一个全局使用的类被频繁创建与销毁
 * 使用场景：
 * 各种计数器，不用每次都写入数据库，可以
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class SingletonDemo {

    @Test
    public void testSingleObject() {
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testSingleObjectLazy() {
        SingleObjectLazy instance1 = SingleObjectLazy.getInstance();
        SingleObjectLazy instance2 = SingleObjectLazy.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testSingleObjectSynchronizedLay() {
        SingleObjectSynchronizedLazy instance1 = SingleObjectSynchronizedLazy.getInstance();
        SingleObjectSynchronizedLazy instance2 = SingleObjectSynchronizedLazy.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testDCLSingleObject() {
        DCLSingleObject instance1 = DCLSingleObject.getInstance();
        DCLSingleObject instance2 = DCLSingleObject.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testInnerSingleObject() {
        InnerSingleObject instance1 = InnerSingleObject.getInstance();
        InnerSingleObject instance2 = InnerSingleObject.getInstance();
        System.out.println(instance1 == instance2);
    }

    @Test
    public void testInnerSingleEnum() {
        SingleEnum instance1 = SingleEnum.INSTANCE;
        SingleEnum instance2 = SingleEnum.INSTANCE;
        System.out.println(instance1 == instance2);
    }


}
