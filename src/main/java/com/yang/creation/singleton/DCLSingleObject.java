package com.yang.creation.singleton;

/**
 * 双检锁/双重校验锁
 * 懒加载+线程安全
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class DCLSingleObject {

    private volatile static DCLSingleObject instance;

    private DCLSingleObject() {
    }

    public static DCLSingleObject getInstance() {
        if (null == instance) {
            synchronized (DCLSingleObject.class) {
                instance = new DCLSingleObject();
            }
        }
        return instance;
    }
}
