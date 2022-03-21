package com.yang.creation.factorymethod;

import java.util.List;

/**
 * 工厂方法案例
 * <p>
 * 介绍：工厂方法就是定一个用于创建对象的接口，让子类决定实例化哪一个类。使一个类的实例化延迟到了子类。
 * 主要解决：使得创建对象和适用对象是是分离的，并且客户端总是引用的抽象工厂和抽象方法。
 * 使用场景：静态工厂方法
 *
 *
 * 为什么一个简单的parse方法做的这么复杂？？？
 * 其实大多数情况下我们不需要抽象工厂，而是通过静态方法直接方法产品。
 * e.g:1～
 * public static parse(String s){
 * return new BigDecimal(s);
 * }
 * 这种简化的静态方法创建产品的方式称为静态工厂方法(static factory method)，静态工厂方法广泛的运用在标准的java标准库中。
 * e.g:
 * Integer n = Integer.valueOf(100);
 * 这种方式创建Integer隐藏了真是的创建过程，实际底层可能是通过缓存返回一个已存在的Integer实例，也可能是new一个新的Integer
 * 但是对于用户来说不需要直到这些细节。
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class FactoryMethodDemo {


    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        Number result = factory.parse("123.456");
        System.out.println(result);

        Integer i = Integer.valueOf(10);
    }

}
