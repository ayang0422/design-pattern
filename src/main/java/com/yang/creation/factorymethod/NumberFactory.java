package com.yang.creation.factorymethod;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public interface NumberFactory {

    //  创建方法:
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

    NumberFactory impl = new NumberFactoryImpl();
}
