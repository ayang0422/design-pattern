package com.yang.creation.singleton;

/**
 * 单例对象
 * 非懒加载+线程安全
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class SingleObject {

    /**
     * 饿汉式单例
     */
    private static final SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void say(){
        System.out.println("I am a single");
    }
}
