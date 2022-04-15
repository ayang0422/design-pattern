package com.yang.structure.bridge;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月15日
 */
public class Circle extends Shape{

    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius);
    }
}
