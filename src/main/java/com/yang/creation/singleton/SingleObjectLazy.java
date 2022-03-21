package com.yang.creation.singleton;

/**
 * 懒加载+线程不安全
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class SingleObjectLazy {

    /**
     * 懒汉式---线程不安全
     */
    private static SingleObjectLazy instance;

    private SingleObjectLazy() {
    }

    public static SingleObjectLazy getInstance() {
        if (null == instance) {
            instance = new SingleObjectLazy();
            return instance;
        }
        return instance;
    }
}
