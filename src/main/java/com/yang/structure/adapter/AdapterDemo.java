package com.yang.structure.adapter;

/**
 * 适配器模式案例
 * <p>
 * 介绍：作为两个不兼容的接口之间的桥梁。属于结构型模式，结合两个独立接口的功能。
 * 主要解决：常常将一些现存的对象放到新的环境中，而新的环境要求的接口是现对象不能满足的。
 * 使用场景：
 * 有动机的修改一个正常运行的接口，这时候可以考虑适配器模式
 * 实例：
 * springAOP
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class AdapterDemo {

    public static void main(String[] args) {
        Target adapter = new Adapter220();
        adapter.convertTo220V();
    }
}
