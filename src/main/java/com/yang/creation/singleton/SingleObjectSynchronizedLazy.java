package com.yang.creation.singleton;

/**
 * 懒加载+线程安全
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class SingleObjectSynchronizedLazy {

    /**
     * 懒汉式---线程安全
     */
    private static SingleObjectSynchronizedLazy instance;

    private SingleObjectSynchronizedLazy() {
    }

    public static synchronized SingleObjectSynchronizedLazy getInstance() {
        if (null == instance) {
            instance = new SingleObjectSynchronizedLazy();
            return instance;
        }
        return instance;
    }
}
