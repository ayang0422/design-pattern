package com.yang.creation.singleton;

/**
 * 登记式/静态内部类
 * 非懒加载+线程安全
 * 类加载机制保证了InnerSingleObject被装载的时候 InnerSingleObjectHolder还没有被加载，
 * 只有通过显示的调用getInstance方法的时候，才会去加载InnerSingleObjectHolder类
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class InnerSingleObject {

    private static class InnerSingleObjectHolder {
        private static final InnerSingleObject INSTANCE = new InnerSingleObject();
    }

    public static InnerSingleObject getInstance() {
        return InnerSingleObjectHolder.INSTANCE;
    }
}
