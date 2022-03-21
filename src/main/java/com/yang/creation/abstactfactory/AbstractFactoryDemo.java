package com.yang.creation.abstactfactory;

/**
 * 抽象工厂案例
 * 工厂模式和抽象工厂模式的区别：工厂模式对于只生产鼠标或者只生产键盘的工厂已经够用了，
 * 但是对于既生产鼠标又生产键盘的工厂就不适用了，通过抽象一层工厂，
 * 得到两个不通品牌的工厂能够完成各自品牌的不同产品
 * <p>
 * 介绍：
 *  抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 *  这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *  在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * 主要解决：主要解决接口选择的问题
 * 使用场景：
 *  1.游戏皮肤一整套一起换
 *  2.生产汽车，所有零件都是一个品牌自己生产
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractPCFactory appleFactory = new AppleFactory();
        appleFactory.createKeyboard().say();
        appleFactory.createMouse().say();

        AbstractPCFactory hpFactory = new HpFactory();
        hpFactory.createKeyboard().say();
        hpFactory.createMouse().say();
    }

}
