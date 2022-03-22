package com.yang.creation.builder;

/**
 * 严格建造者模式
 *
 * 介绍：
 *  使用多个简单的对象一步步的构建成一个复杂的对象。
 * 主要解决：主要解决一个复杂对象的创建工作
 * 使用场景：
 *  1.生成的对象具有复杂对象的内部结构
 *  2.需要生成的对象内部属性本身相互依赖
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class BuilderDemo {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        MacComputerBuilder macComputerBuilder = new MacComputerBuilder("m1", "sansung", "sansung");
        director.makeComputer(macComputerBuilder);
        Computer mac = macComputerBuilder.getComputer();
        System.out.println(mac);


        MacComputerBuilder huaweiComputerBuilder = new MacComputerBuilder("i7", "sandisk", "sandisk");
        director.makeComputer(huaweiComputerBuilder);
        Computer huawei = huaweiComputerBuilder.getComputer();
        System.out.println(huawei);

    }
}
