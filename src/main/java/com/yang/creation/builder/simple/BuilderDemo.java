package com.yang.creation.builder.simple;

/**
 * 简单版的建造者模式
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("mac", "sansung", "sansung")
                .monitor("LG").keyboard("apple").mouse("apple").build();
        System.out.println(computer);
    }
}
