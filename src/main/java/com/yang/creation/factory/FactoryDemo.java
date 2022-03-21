package com.yang.creation.factory;

/**
 * 工厂模式案例
 * <p>
 * 介绍：工厂模式就是在创建的时候不会向客户端暴露创建的逻辑，而是通过一个公共的接口创建新的对象
 * 主要解决：主要解决接口选择的问题
 * 使用场景：
 *  1. hibernate方言选择
 *  2. 日志记录的方式选择，如写入磁盘或者发送网络
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月20日
 */
public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("triangle").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("123321").draw();
    }
}
