package com.yang.creation.protorype;

/**
 * 原型模式案例
 * <p>
 * 介绍：
 * 是指创建新对象的时候，根据现有的原型来创建。
 *
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月23日
 */
public class ProtortypeDemo {

    public static void main(String[] args) {
        ShapeCache.LoadShape();
        Shape shape1 = ShapeCache.getShapeById("1");
        Shape shape2 = ShapeCache.getShapeById("2");
        Shape shape3 = ShapeCache.getShapeById("3");

        Shape shape4 = ShapeCache.getShapeByType("circle");
        Shape shape5 = ShapeCache.getShapeByType("rectangle");
        Shape shape6 = ShapeCache.getShapeByType("square");

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
        System.out.println(shape5);
        System.out.println(shape6);
    }
}
